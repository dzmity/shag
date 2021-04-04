package by.shag.lesson27.rafalovich.task6;

public class ProviderThread extends Thread {

    private final Shop shop;
    private final int quantity;

    public ProviderThread(Shop shop, int quantity) {
        this.shop = shop;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        try {
            shop.deliver(quantity);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}