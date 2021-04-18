package by.shag.lesson28.golatina;

import static by.shag.lesson28.golatina.Car.SEMAPHORE;

public class StatisticsThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Количество свободных мест на парковке = " + SEMAPHORE.availablePermits());
                sleep(1_000);
            }
        } catch (InterruptedException e) {
        }
    }

}
