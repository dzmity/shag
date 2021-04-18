package by.shag.lesson27.savostyanchik;

import java.io.File;
import java.io.IOException;

public class MassThread extends Thread {
    private static int count = 0;
    private final String[] massLines;


    public MassThread(String[] massLines) {
        this.massLines = massLines;
    }

    @Override
    public void run() {
        while (true) {
            if (count >= massLines.length) {
                break;
            }

            count++;

            String fileName = massLines[count - 1];
            String dirName = System.getProperty("user.dir");
            String fullName = dirName + File.separator + fileName;
            System.out.println("File path: " + fullName);
            File file = new File(fullName);


            if (!file.exists()) {
                try {
                    if (file.createNewFile()) {
                        System.out.println("File created ");
                    } else {
                        System.out.println("Something Wrong!");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                System.out.println("The file has already been created!");
            }
        }
    }
}