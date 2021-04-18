package by.shag.lesson28.rafalovich;


public class InformerThread extends Thread {

    private final Parking parking;

    private final WinnerHolder winnerHolder;

    public InformerThread(Parking parking, WinnerHolder winnerHolder) {
        this.parking = parking;
        this.winnerHolder = winnerHolder;
    }

    @Override
    public void run() {
        try {
            parking.getCountDownLatch().await();
            System.out.println("У нас 1000-ый посетитель!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            while (winnerHolder.getWinnerThreadName() == null) {
                Thread.sleep(100);
            }
            System.out.println("1000-ый посетитель - " + winnerHolder.getWinnerThreadName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
