package by.shag.lesson27.shustova.task6;

public class CustomerThread implements Runnable {

    private final Shop shop;
    private final int quantity;

    public CustomerThread(Shop shop, int quantity) {
        this.shop = shop;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        try {
            shop.buy(quantity);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}