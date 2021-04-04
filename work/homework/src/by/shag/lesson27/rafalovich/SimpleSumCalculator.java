package by.shag.lesson27.rafalovich;

import java.util.List;

public class SimpleSumCalculator implements Runnable {

    private final List<Integer> userArrayList;

    public SimpleSumCalculator(List<Integer> userArrayList) {
        this.userArrayList = userArrayList;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < userArrayList.size(); i++) {
            sum += userArrayList.get(i);
        }
        System.out.println(sum);
    }
}
