package by.shag.lesson27.litvinov;

import java.util.LinkedList;
import java.util.List;

public class Repository {

    private Integer sum = 0;
    private LinkedList<String> fileData = new LinkedList<>();

    public Repository() {
    }

    public Integer getSum() {
        return sum;
    }

    public List<String> getFileData() {
        return fileData;
    }

    public synchronized void addValueInRepository(Integer value) {
        sum += value;
    }

    public synchronized void addLineInFileData(String line) {
        fileData.addLast(line);
        notify();
    }

    public synchronized String pollFirstLineFromFileData() throws InterruptedException {
        while (fileData == null) {
            wait();
        }
        return fileData.pollFirst();
    }
}
