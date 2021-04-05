package by.shag.lesson26.store;

public class Repository {

    public static final Integer MAX_CAPACITY = 10;

    private volatile int currentProductQuantity;

    public Repository(int currentProductQuantity) {
        this.currentProductQuantity = currentProductQuantity;
    }

    public synchronized void getProduct() throws InterruptedException {
        while (currentProductQuantity < 1) {
            System.out.println("Склад пуст. Ждем");
            wait();
        }
        currentProductQuantity--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + currentProductQuantity);
        notifyAll();
    }


    public synchronized void produceProduct() throws InterruptedException {
        while (currentProductQuantity >= MAX_CAPACITY) {
            System.out.println("Склад переполнен. Ждем");
            wait();
        }
        currentProductQuantity++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + currentProductQuantity);
        notifyAll();
    }
}
