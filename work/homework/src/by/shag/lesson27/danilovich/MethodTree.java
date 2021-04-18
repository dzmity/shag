package by.shag.lesson27.danilovich;

import java.util.List;

public class MethodTree  implements Runnable {

    private List<Integer> list;
    private int sum = 0;

    public MethodTree() {
    }

    public MethodTree(List<Integer> list) {
        this.list = list;
    }


    @Override
    public void run() {
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(Thread.currentThread().getName() + ", сумма: " + sum);
    }
}
