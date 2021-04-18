package by.shag.lesson27.litvinov.thread;

import by.shag.lesson27.litvinov.FileManager;
import by.shag.lesson27.litvinov.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileThread extends Thread {

    private final static String FILENAME = "from.txt";
    private final Repository repository;

    public ReadFileThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new FileReader(FileManager.generateFullName(FILENAME)))) {
            String line;
            while ((line = br.readLine()) != null) {
                repository.addLineInFileData(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
