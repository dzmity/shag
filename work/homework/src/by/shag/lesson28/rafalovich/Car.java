package by.shag.lesson28.rafalovich;


import java.util.concurrent.TimeUnit;

public class Car extends Thread {

    private final Parking parking;

    private final WinnerHolder winnerHolder;

    public Car(Parking parking, WinnerHolder winnerHolder) {
        this.parking = parking;
        this.winnerHolder = winnerHolder;
    }

    @Override
    public void run() {
        if (isInterrupted()) {
            return;
        }
        tryToPark(1);

        if (isInterrupted()) {
            return;
        }
        doSomeWork();

        if (isInterrupted()) {
            return;
        }
        tryToPark(2);
    }

    private void doSomeWork() {
        try {

            System.out.println(getName() + " ездит по городу");
            sleep((long) (Math.random() * 2001 + 1000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void tryToPark(int time) {
        try {

            System.out.println(getName() + " пытается заехать " + time + " раз на парковку");
            while (!parking.getSemaphore().tryAcquire(2, TimeUnit.SECONDS)) {
                System.out.println(getName() + " ездит по городу в поисках другой парковки");
                sleep(10_00L);
            }
            System.out.println(getName() + " заехал " + time + "  раз на парковку");
            parking.getCountDownLatch().countDown();

            sleep((long) (Math.random() * 2001 + 1000));
            if (parking.getLatchCount() == 0) {
                winnerHolder.setWinnerThreadName(getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getName() + " уехал " + time + "  раз с парковки");
            parking.getSemaphore().release();
        }
    }
}
