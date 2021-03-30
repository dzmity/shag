package by.shag.lesson26.interruption;

public class SleeperThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(10_000L);
        } catch (InterruptedException e) {
            System.out.println("Sleep method is interrupted");
        }
        System.out.println("Sleeper thread is finished");
    }

}
