package by.shag.lesson27.litvinov;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {
    private final static String DIR = "/src/by/shag/lesson27/litvinov/txt";

    public static String generateDirName() {
        return System.getProperty("user.dir") + DIR;
    }

    public static String generateFullName(String fileName) {
        return generateDirName() + File.separator + fileName;
    }

    public static void createDir() {
        String dirName = generateDirName();
        File dir = new File(dirName);
        try {
            if (dir.mkdirs()) {
                System.out.println("Directory " + dirName + " is created!");
            } else {
                System.out.println("Directory " + dirName + " already exists!");
            }
        } catch (SecurityException se) {
            Logger.getLogger(FileManager.class.getName()).log(Level.ALL, null, se);
        }
    }

    public static void createFile(String fileName) {
        String fullName = generateFullName(fileName);
        File file = new File(fullName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File " + fullName + " created!");
                } else {
                    System.out.println("Something Wrong!");
                }
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File " + fullName + " already exists!");
        }
    }
}
