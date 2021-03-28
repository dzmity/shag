package by.shag.lesson26.interruption;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        Thread worker = new WorkerThread();
        Thread sleeper = new SleeperThread();

        worker.start();
        sleeper.start();

        Thread.sleep(1_000L);

        worker.interrupt();
        sleeper.interrupt();

//        worker.join();
//        sleeper.join();

        System.out.println("Main thread is finished");
    }
}
