package by.shag.lesson29.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Repository {

    public static final Integer MAX_CAPACITY = 10;

    private Lock lock = new ReentrantLock(true);
    private Condition notEnoughProducts = lock.newCondition();
    private Condition tooManyProducts = lock.newCondition();

    private int currentProductQuantity;

    public Repository(int currentProductQuantity) {
        this.currentProductQuantity = currentProductQuantity;
    }

    public void getProduct() throws InterruptedException {
        lock.lock();
        try {
            while (currentProductQuantity < 1) {
                System.out.println("Склад пуст. Ждем");
                tooManyProducts.signalAll();
                notEnoughProducts.await();
            }
            currentProductQuantity--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + currentProductQuantity);
        } finally {
            lock.unlock();
        }

    }


    public void produceProduct() throws InterruptedException {
        lock.lock();
        try {
            while (currentProductQuantity >= MAX_CAPACITY) {
                System.out.println("Склад переполнен. Ждем");
                notEnoughProducts.signalAll();
                tooManyProducts.await();
            }
            currentProductQuantity++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + currentProductQuantity);
        } finally {
            lock.unlock();
        }
    }
}
