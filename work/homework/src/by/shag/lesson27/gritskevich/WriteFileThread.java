package by.shag.lesson27.gritskevich;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Exchanger;

public class WriteFileThread implements Runnable {

    Exchanger<String> exchanger;
    String message;

    public WriteFileThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            File file = new File(System.getProperty("user.dir") + "/src/by/shag/lesson25/gritskevich" + File.separator + "to.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            message = exchanger.exchange(message);
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
