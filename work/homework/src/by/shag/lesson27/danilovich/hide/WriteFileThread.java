package by.shag.lesson27.danilovich.hide;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriteFileThread implements Runnable {

    private String line;

    public WriteFileThread(String line) {
        this.line = line;
    }

    @Override
    public synchronized void run() {
        String dirName = System.getProperty("user.dir");
        File file = new File(dirName + File.separator + "to.txt");

        try {
            if (file.createNewFile()) {
                try {
                    FileOutputStream writer = new FileOutputStream(file);
                    writer.write(line.getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    FileOutputStream writer = new FileOutputStream(file);
                    writer.write(line.getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}

