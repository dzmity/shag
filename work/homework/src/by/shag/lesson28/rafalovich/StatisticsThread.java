package by.shag.lesson28.rafalovich;


public class StatisticsThread extends Thread {

    private final Parking parking;

    public StatisticsThread(Parking parking) {
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Количество свободных мест на парковке = " + parking.getFreeParkingSpacesQuantity());
                sleep(1_000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
