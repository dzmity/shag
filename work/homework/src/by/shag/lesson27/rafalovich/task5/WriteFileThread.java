package by.shag.lesson27.rafalovich.task5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteFileThread extends Thread {

    private final String dirName = System.getProperty("user.dir");

    private final String fileName = dirName + File.separator + "to.txt";

    private final StringHolder holder;

    public WriteFileThread(StringHolder holder) {
        this.holder = holder;
    }

    @Override
    public void run() {
        try (OutputStream out = new FileOutputStream(fileName);
                Writer writer = new OutputStreamWriter(out);
                BufferedWriter buf = new BufferedWriter(writer)) {
            String line = null;
            while ((line = holder.getTextLine()) != null) {
                System.out.println("Write line = " + line);
                buf.write(line);
                buf.newLine();
                holder.setTextLine(null);
            }
            holder.lastNotify();
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
