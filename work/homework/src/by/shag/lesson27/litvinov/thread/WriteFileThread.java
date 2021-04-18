package by.shag.lesson27.litvinov.thread;

import by.shag.lesson27.litvinov.FileManager;
import by.shag.lesson27.litvinov.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileThread extends Thread {

    private final static String FILENAME = "to.txt";
    private final Repository repository;

    public WriteFileThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileManager.generateFullName(FILENAME)))) {
            String line;
            while ((line = repository.pollFirstLineFromFileData()) != null) {
                bw.write(line + "\n");
                bw.flush();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
