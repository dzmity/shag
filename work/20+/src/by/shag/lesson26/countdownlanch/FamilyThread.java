package by.shag.lesson26.countdownlanch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class FamilyThread extends Thread {

    private final CountDownLatch countDownLatch;

    public FamilyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s started for preparing", getName()));
        try {
            Thread.sleep( (int) (Math.random() * 10_000));
            System.out.println(String.format("%s is ready", getName()));
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
