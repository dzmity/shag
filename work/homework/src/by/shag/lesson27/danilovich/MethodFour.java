package by.shag.lesson27.danilovich;

import java.io.*;
import java.util.List;

public class MethodFour implements Runnable {

    private List<Integer> list;
    private int sum = 0;

    public MethodFour(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer integer : list) {
            sum += integer;
        }

        String dirName = System.getProperty("user.dir");
        File file = new File(dirName + File.separator + "sum.txt");
        try {
            if (file.createNewFile()) {
                try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
                    out.write(String.valueOf(sum) + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
                    out.write(String.valueOf(sum) + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ", сумма: " + sum);
    }
}
