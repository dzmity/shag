package by.shag.lesson27.savostyanchik;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileThread extends Thread {
    private final File inputFile;
    private final File outputFile;

    public ReadFileThread(File inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    @Override
    public void run() {
        try (InputStream in = new FileInputStream(inputFile)) {
            WriteFileThread write = new WriteFileThread(in, outputFile);
            write.start();
            write.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
