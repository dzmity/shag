package by.shag.lesson27.gritskevich;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Exchanger;

public class ReadFileThread implements Runnable {

    Exchanger<String> exchanger;

    public ReadFileThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            File file = new File(System.getProperty("user.dir") + "/src/by/shag/lesson25/gritskevich" + File.separator + "from.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            exchanger.exchange(bufferedReader.readLine());
            bufferedReader.close();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
