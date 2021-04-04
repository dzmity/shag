package by.shag.lesson27.golatina;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static by.shag.lesson27.golatina.Runner.lineTransfer;

public class WriteFileThread extends Thread {

    private File fileWrite;
    private FileWriter fileWriter;


    public WriteFileThread(File file) throws IOException {
        this.fileWrite = file;
        this.fileWriter = new FileWriter(file, true);
    }

    @Override
    public void run() {
        if (!fileWrite.exists()) {
            try {
                fileWrite.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            while (lineTransfer != null) {
                fileWriter.write(lineTransfer + "\r\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
