package by.shag.lesson27.rafalovich;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class SumCalculator implements Runnable {

    private final List<Integer> userArrayList;

    private AtomicLong totalSum;


    public SumCalculator(List<Integer> userArrayList, AtomicLong totalSum) {
        this.userArrayList = userArrayList;
        this.totalSum = totalSum;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < userArrayList.size(); i++) {
            sum += userArrayList.get(i);
        }
        totalSum.getAndAdd(sum);
    }
}