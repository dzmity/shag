package by.shag.lesson28.rafalovich;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Parking {

    private final Semaphore semaphore;

    private final CountDownLatch countDownLatch;

    private boolean winnerFound;


    public Parking(Semaphore semaphore, CountDownLatch countDownLatch) {
        this.semaphore = semaphore;
        this.countDownLatch = countDownLatch;
    }

    public int getFreeParkingSpacesQuantity() {
        return semaphore.availablePermits();
    }


    public synchronized long getLatchCount() {
        if (winnerFound) {
            return -1;
        }
        if (countDownLatch.getCount() == 0) {
            winnerFound = true;
        }
        return countDownLatch.getCount();
    }

    public Semaphore getSemaphore() {
        return semaphore;
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }
}
