package by.shag.lesson27.danilovich;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MethodTwo extends Thread {
    private List<String> list;

    public MethodTwo(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (String s : list) {
            String dirName = System.getProperty("user.dir");
            File file = new File(dirName + File.separator + s + ".txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("Создан файл: " + file.getName() + "\nПуть файла: " + file.getParent());
                } else {
                    System.out.println("Равзмер: " + file.length() + " byte" + "\nПуть файла: " + file.getParent());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}