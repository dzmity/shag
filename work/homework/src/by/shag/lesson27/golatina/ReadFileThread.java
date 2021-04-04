package by.shag.lesson27.golatina;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static by.shag.lesson27.golatina.Runner.lineTransfer;

public class ReadFileThread extends Thread {

    private File fileRead;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    public ReadFileThread(File file) throws IOException {
        this.fileRead = file;
        this.fileReader = new FileReader(file);
        this.bufferedReader = new BufferedReader(fileReader);
    }

    @Override
    public void run() {
        try {
            lineTransfer = bufferedReader.readLine();
            while (lineTransfer != null) {
                lineTransfer = bufferedReader.readLine();
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
