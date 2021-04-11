package by.shag.lesson29.lock;

public class ConsumerThread extends Thread {

    private Repository repository;

    public ConsumerThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        try {
            repository.getProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
