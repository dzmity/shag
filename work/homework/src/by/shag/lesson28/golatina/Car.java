package by.shag.lesson28.golatina;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread {

    protected static final Semaphore SEMAPHORE = new Semaphore(100);
    protected static volatile String threadCurrentName;
    private static StatisticsThread statisticsThread;
    private static CountDownLatch countForCongratulation = new CountDownLatch(1000);
    private static InformerThread informerThread;
    private static Thread finalThread;
    private static Thread parking;

    public Car() {
        if (parking == null) {
            parking = new Thread(() -> {
                try {
                    sleep(40_000);
                    System.out.println("Истек срок работы парковки.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            parking.start();
        }
        if (informerThread == null) {
            informerThread = new InformerThread(countForCongratulation);
            informerThread.start();
        }
        if (statisticsThread == null) {
            statisticsThread = new StatisticsThread();
            statisticsThread.start();
        }
        if (finalThread == null) {
            finalThread = new Thread(() -> {
                try {
                    while (parking.isAlive()) {
                        sleep(1_000);
                    }
                    statisticsThread.interrupt();
                    sleep(2_000);
                    System.out.println("Количество свободных мест на парковке через 2 сек после закрытия = " + SEMAPHORE.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            finalThread.start();
        }
    }

    @Override
    public void run() {
        int parkingVisits = 0;
        try {
            while (parkingVisits < 2 || !parking.isAlive()) {
                if (SEMAPHORE.tryAcquire(2, TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " заехал, стоит");

                    threadCurrentName = Thread.currentThread().getName();
                    countForCongratulation.countDown();

                    sleep((long) (Math.random() * 2001 + 1000));
                    SEMAPHORE.release();

                    if (parkingVisits == 0 && parking.isAlive()) {
                        System.out.println(Thread.currentThread().getName() + " выехал с парковки, катается по городу");
                        sleep((int) (Math.random() * 2001 + 1000));

                    } else if (parking.isAlive()) {
                        System.out.println(Thread.currentThread().getName() + " не нашел парковку, ищу другую 10 сек");
                        sleep(10_000);
                    }
                }
                if (!parking.isAlive()) {
                    interrupt();
                }
                parkingVisits++;
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " isInterrupt - больше не претендует на парковку");
        } finally {
            SEMAPHORE.release();
        }
    }

}
