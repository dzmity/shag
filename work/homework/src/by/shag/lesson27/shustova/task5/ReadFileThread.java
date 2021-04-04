package by.shag.lesson27.shustova.task5;

import java.io.*;
import java.util.List;

public class ReadFileThread implements Runnable {

    final private String dirName = System.getProperty("user.dir");
    final String nameFile = dirName + File.separator + "from.txt";

    private final List<String> allLines;


    public ReadFileThread(List<String> allLines) {
        this.allLines = allLines;
    }

    @Override
    public synchronized void run() {
        try (InputStream in = new FileInputStream(nameFile);
             Reader reader = new InputStreamReader(in);
             BufferedReader buf = new BufferedReader(reader)) {
            while (buf.ready()) {
                allLines.add(buf.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
