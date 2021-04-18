package by.shag.lesson27.danilovich.hide;

import java.io.*;

public class ReadFileThread implements Runnable {

    private String mass;

    public String getMass() {
        return mass;
    }

    @Override
    public synchronized void run() {

        String dirName = System.getProperty("user.dir");
        File file = new File(dirName + File.separator + "from.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                mass = line;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

