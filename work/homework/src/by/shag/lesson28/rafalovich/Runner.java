package by.shag.lesson28.rafalovich;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;



public class Runner {

    public static final int PARKING_CAPACITY = 100;

    public static final int WINNER_NUMBER = 1000;

    public static final int CAR_QUANTITY = 3000;

    public static void main(String[] args) throws Exception{
        Semaphore semaphore = new Semaphore(PARKING_CAPACITY);
        CountDownLatch countDownLatch = new CountDownLatch(WINNER_NUMBER);
        Parking parking = new Parking(semaphore, countDownLatch);
        WinnerHolder winnerHolder = new WinnerHolder();
        StatisticsThread statisticsThread = new StatisticsThread(parking);
        statisticsThread.setDaemon(true);
        statisticsThread.start();
        new InformerThread(parking, winnerHolder);

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < CAR_QUANTITY; i++) {
            Car car = new Car(parking, winnerHolder);
            cars.add(car);
            car.start();
        }
        Thread.sleep(38_000L);
        for (int i = 0; i < CAR_QUANTITY; i++) {
           cars.get(i).interrupt();
        }
        Thread.sleep(2_00L);
        System.out.println(parking.getFreeParkingSpacesQuantity());
    }
}
