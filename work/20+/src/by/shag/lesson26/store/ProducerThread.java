package by.shag.lesson26.store;

public class ProducerThread extends Thread {

    private Repository repository;

    public ProducerThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        try {
            repository.produceProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
