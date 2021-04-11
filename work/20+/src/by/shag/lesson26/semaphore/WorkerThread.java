package by.shag.lesson26.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class WorkerThread extends Thread {

    private final Semaphore semaphore;


    public WorkerThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (true) {
            doSomeWork();
        }
    }

    private void doSomeWork() {
        try {
            System.out.println(getName() + "try to get access");
            semaphore.acquire();
            System.out.println(getName() + " get access");
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println(getName() + " return access");
        }
    }
}
