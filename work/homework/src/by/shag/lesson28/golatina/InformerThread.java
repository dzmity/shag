package by.shag.lesson28.golatina;

import java.util.concurrent.CountDownLatch;

import static by.shag.lesson28.golatina.Car.threadCurrentName;


public class InformerThread extends Thread {

    private CountDownLatch countDownLatch;

    public InformerThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(threadCurrentName + " наш 1000-ый посетитель!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
