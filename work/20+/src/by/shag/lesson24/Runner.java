package by.shag.lesson24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Runner {

    public static void main(String[] args) {

        String fileName = "lesson23_01.txt";
        String dirName = System.getProperty("user.dir");
        String fullName = dirName + File.separator + fileName;
        System.out.println("File path : " + fullName);
        File file = new File(fullName);


        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created!");
                } else {
                    System.out.println("Something Wrong!");
                }
            } catch (IOException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File already exists!");
        }


        // Для создания папок использются методы mkdir() и mkdirs()
        // рассказать пр оразницу
        String dirname = dirName + "/tmp/user/java/bin";
        File d = new File(dirname);
        // Create directories now.
        d.mkdirs();

        // Дополнительно методы
        // file.deleteOnExit();
        // file.getFreeSpace();
        // file.getTotalSpace();
        // file.setReadonly();

//        readAndWriteInOnePortion();
//        readAndWriteInPortions();
//        readAndWriteInBytes();
//        readAndWriteByteArray();
//        readAndWriteBufferedStreams();
//        readAndWriteObject();
        readAndWriteBufferedStreams();
    }


    private static void readAndWriteInOnePortion() {
        InputStream in = null;
        OutputStream out = null;
        byte[] buffer = null;
        try {
            File inputFile = new File(generateFilePath("lesson23_01.txt"));
            in = new FileInputStream(inputFile);
            buffer = new byte[in.available()];
            in.read(buffer);


            // можем копировать и картинку
            File outputFile = new File(generateFilePath("lesson23_03.txt"));
            out = new FileOutputStream(outputFile);
            out.write(buffer);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("problem with io logic");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("exception during the close input stream");
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("exception during the close output stream");
            }
        }
    }

    private static void readAndWriteInPortions() {
        File inputFile = new File(generateFilePath("lesson23_01.txt"));
        File outputFile = new File(generateFilePath("lesson23_03.txt"));
        byte[] buffer = new byte[8 * 1024];
        try (InputStream in = new FileInputStream(inputFile);
                OutputStream out = new FileOutputStream(outputFile)) {

            int bytesRead = 0;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("exception during the close input stream");
            e.printStackTrace();
        }
    }

    private static void readAndWriteInBytes() {
        File inputFile = new File(generateFilePath("lesson23_01.txt"));
        File outputFile = new File(generateFilePath("lesson23_03.txt"));

        try (InputStream in = new FileInputStream(inputFile);
                OutputStream out = new FileOutputStream(outputFile)) {
            int oneByte;
            while ((oneByte = in.read()) != -1) {
                if (oneByte < 65) {
                    // только знаки препинания и цифры (ascii codes)
                    out.write(oneByte);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("exception during the close input stream");
            e.printStackTrace();
        }
    }

    private static void readAndWriteByteArray() {
        String line = "This is a sample string to be capitalized";
        ByteArrayInputStream bais = new ByteArrayInputStream(line.getBytes());
        int ch;
        StringBuilder sb = new StringBuilder();
        while ((ch = bais.read()) != -1) {
            sb.append(Character.toUpperCase((char) ch));
        }
        System.out.println("Capitalized string: " + sb.toString());
    }

    private static void readAndWriteBufferedStreams() {
        //////////// write from string in file
        String line = "This is 25 lesson. OMG!";
        try (FileOutputStream out = new FileOutputStream("buffered_stream.txt");
                BufferedOutputStream bos = new BufferedOutputStream(out)) {

            byte[] lineInBytes = line.getBytes();
            bos.write(lineInBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ////////////// read from file and sout every symbol
        try (FileInputStream in = new FileInputStream("buffered_stream.txt");
                BufferedInputStream bis = new BufferedInputStream(in)) {

            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // запустить несколько раз
    private static void readerAndWriter() {

        try (FileReader in = new FileReader("file_reader.txt");
                BufferedReader br = new BufferedReader(in);
                FileWriter out = new FileWriter("file_reader_out.txt"); // true in constructor
                BufferedWriter bw = new BufferedWriter(out)) {

            String line = null;
            int lineCounter = 0;

            while ((line = br.readLine()) != null) {
                // записываем каждую четную строку
                if ((lineCounter++) % 2 == 0) {
                    // меняем e на E
                    String newLine = line.replace("e", "E");
                    bw.write(line + System.getProperty("line.separator"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readAndWriteObject() {
        FileOutputStream fout = null;
        ObjectOutputStream oout = null;
        try {
            fout = new FileOutputStream("person.txt");
            Person f = new Person("Sanya", "Pushkin");
            oout = new ObjectOutputStream(fout);
            oout.writeObject(f);

            // +  прочитать из файла
            // + transient
            // long serialVersionUID = 1L;  (непредсказуемо число сгенереное компилятором).
            // а как можно сериализовать объекты в которых есть другие объекты
            // Externalizable или своя сериализация/десериализация не reflection + static final
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println();
        } finally {
            try {
                oout.close();
            } catch (IOException ex) {
                System.out.println("sadf");
            }
        }
    }


    // System in, out , error //set out


    private static String generateFilePath(String fileName) {
        String dirName = System.getProperty("user.dir");
        return dirName + File.separator + fileName;
    }
}
