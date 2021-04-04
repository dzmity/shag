package by.shag.lesson27.rafalovich.task6;

import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    public static final int SHOP_CAPACITY = 50;

    private AtomicInteger productQuantity;

    public Shop() {
    }

    public Shop(int productQuantity) {
        this.productQuantity = new AtomicInteger(productQuantity);
    }

    public AtomicInteger getProductQuantity() {
        return productQuantity;
    }

    public void deliver(int quantity) throws InterruptedException {
        while (productQuantity.get() + quantity > SHOP_CAPACITY) {
            System.out.println("Склад заполнен " + productQuantity);
        }
        productQuantity.getAndAdd(quantity);
        System.out.println("Поставили = " + quantity + " Сейчас на складе = " + productQuantity);
    }

    public void buy(int quantity) throws InterruptedException {
        while (productQuantity.get() < quantity) {
            System.out.println("Количество товара на складе = " + productQuantity
                    + " Ждите поставки..");
        }
        productQuantity.getAndAdd(-1 * quantity);
        System.out.println("Купили = " + quantity + " Сейчас на складе = " + productQuantity);
    }
}
