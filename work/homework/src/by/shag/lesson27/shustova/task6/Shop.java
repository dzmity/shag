package by.shag.lesson27.shustova.task6;

import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    public static final int CAPACITY_SHOP = 50;
    private AtomicInteger product;

    public Shop() {
    }

    public Shop(int product) {
        this.product = new AtomicInteger(product);
    }

    public AtomicInteger getProduct() {
        return product;
    }

    public void deliver(int quantity) throws InterruptedException {
        while (product.get() >= CAPACITY_SHOP || product.get() + quantity > CAPACITY_SHOP) {
            System.out.println("Склад заполнен " + product);
        }
        product.getAndAdd(quantity);
        System.out.println("Поставили = " + quantity + " Сейчас на складе = " + product);
    }

    public void buy(int quantity) throws InterruptedException {
        while (product.get() < quantity) {
            System.out.println("Количество товара на складе = " + product
                    + " Ждите поставки..");
        }
        product.getAndAdd(-1 * quantity);
        System.out.println("Купили = " + quantity + " Сейчас на складе = " + product);
    }
}
