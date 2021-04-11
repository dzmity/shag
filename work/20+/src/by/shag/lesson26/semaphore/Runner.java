package by.shag.lesson26.semaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(3);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new WorkerThread(semaphore);
            threads.add(thread);
            thread.start();
        }

        Thread.sleep(20_000);
        for (Thread thread : threads) {
            thread.interrupt();
        }
    }
}
