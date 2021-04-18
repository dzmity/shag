package by.shag.lesson27.litvinov;

public class Shop {

    private static final Integer MAX_CAPACITY = 50;

    private int currentProductQuantity;

    public Shop(int amountOfProducts) {
        this.currentProductQuantity = amountOfProducts;
    }

    public synchronized void buyProduct() throws InterruptedException {
        while (currentProductQuantity < 1) {
            System.out.println("Товара в магазине нет. Покупатель ждет.");
            wait();
        }
        currentProductQuantity--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе " + currentProductQuantity);
        notifyAll();
    }

    public synchronized void provideProduct() throws InterruptedException {
        while (currentProductQuantity >= MAX_CAPACITY) {
            System.out.println("Магазин переполнен. Поставщик ждет.");
            wait();
        }
        currentProductQuantity += 10;
        System.out.println("Поставщик поставил 10 товаров.");
        System.out.println("Товаров на складе " + currentProductQuantity);
        notifyAll();
    }
}
