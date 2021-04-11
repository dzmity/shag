package by.shag.lesson26.countdownlanch;

import java.util.concurrent.CountDownLatch;

public class TaxiThread extends Thread {

    private final CountDownLatch countDownLatch;

    public TaxiThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println("вызвал такси");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
