package by.shag.lesson27.savostyanchik;

import java.io.*;

public class WriteFileThread extends Thread {
    private final InputStream in;
    private final File outputFile;


    public WriteFileThread(InputStream in, File outputFile) {
        this.in = in;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try (OutputStream out = new FileOutputStream(outputFile)) {
            int oneByte;

            out.write("to.txt - File \n".getBytes());

            while ((oneByte = in.read()) != -1) {
                out.write(oneByte);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
