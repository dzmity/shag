package by.shag.lesson27.litvinov.thread;

import by.shag.lesson27.litvinov.Shop;

public class CustomerThread extends Thread {

    private final Shop shop;

    public CustomerThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.buyProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
