package by.shag.lesson27.rafalovich.task5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class ReadFileThread extends Thread {

    private final String dirName = System.getProperty("user.dir");
    private final String nameFile = dirName + File.separator + "from.txt";

    private final StringHolder holder;

    public ReadFileThread(StringHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        try (InputStream in = new FileInputStream(nameFile);
             Reader reader = new InputStreamReader(in);
             BufferedReader buf = new BufferedReader(reader)) {
            String line = null;
            while ((line = buf.readLine()) != null) {
                System.out.println("Read line = " + line);
                holder.setTextLine(line);
            }
            holder.setTextLine(null);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
