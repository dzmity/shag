package by.shag.lesson26.interruption;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        Thread worker = new WorkerThread();
//        worker.setDaemon(true);
        Thread sleeper = new SleeperThread();
//        sleeper.setDaemon(true);

        worker.start();
        sleeper.start();

        Thread.sleep(1_000L);

//        worker.interrupt();
//        sleeper.interrupt();
        worker.join(1_000);
        sleeper.join(2_000);

        System.out.println("Main thread is finished");
    }
}
