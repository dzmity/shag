package by.shag.lesson27.rafalovich;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileCreatorThread extends Thread {

    private final List<Integer> userArrayList;

    private final int startPoint;

    private final int endPoint;

    public FileCreatorThread(List<Integer> userArrayList, int startPoint, int endPoint) {
        this.userArrayList = userArrayList;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public void run() {
        File directory = new File(System.getProperty("user.dir"));
        System.out.println(directory);
        if (!directory.exists()) {
            directory.mkdir();
        }

        for (int i = startPoint; i <= endPoint; i++) {
            File file = new File(directory + File.separator + (userArrayList.get(i - 1) + ".txt"));
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
