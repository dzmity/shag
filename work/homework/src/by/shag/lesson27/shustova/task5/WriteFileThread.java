package by.shag.lesson27.shustova.task5;

import java.io.*;
import java.util.List;

public class WriteFileThread implements Runnable {

    final private String dirName = System.getProperty("user.dir");
    final String nameFile = dirName + File.separator + "to.txt";
    final private List<String> allLines;


    public WriteFileThread(List<String> allLines) {
        this.allLines = allLines;
    }

    @Override
    public synchronized void run() {
        try (OutputStream out = new FileOutputStream(nameFile);
             Writer writer = new OutputStreamWriter(out);
             BufferedWriter buf = new BufferedWriter(writer)) {
            for (int i = 0; i < allLines.size(); i++) {
                String line = allLines.get(i);
                buf.write(line);
                buf.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
