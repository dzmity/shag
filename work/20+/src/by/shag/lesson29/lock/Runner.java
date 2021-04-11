package by.shag.lesson29.lock;

import by.shag.lesson26.store.ConsumerThread;
import by.shag.lesson26.store.ProducerThread;
import by.shag.lesson26.store.Repository;

public class Runner {

    public static void main(String[] args) {
        by.shag.lesson26.store.Repository repository = new Repository(5);
        for (int i = 0; i < 10; i++) {
            new ConsumerThread(repository).start();
        }
        for (int i = 0; i < 10; i++) {
            new ProducerThread(repository).start();
        }
    }
}
