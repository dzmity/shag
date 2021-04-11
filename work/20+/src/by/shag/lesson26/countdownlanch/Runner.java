package by.shag.lesson26.countdownlanch;

import java.util.concurrent.CountDownLatch;

public class Runner {


    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        new TaxiThread(countDownLatch).start();
        for (int i = 0; i < 4; i++) {
            new FamilyThread(countDownLatch).start();
        }
    }
}
