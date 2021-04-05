package by.shag.lesson26.store;

public class Runner {

    public static void main(String[] args) {
        Repository repository = new Repository(5);
        for (int i = 0; i < 1000; i++) {
            new ConsumerThread(repository).start();
        }
        for (int i = 0; i < 1000; i++) {
            new ProducerThread(repository).start();
        }

    }
}
