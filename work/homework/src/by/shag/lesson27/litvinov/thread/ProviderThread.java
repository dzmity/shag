package by.shag.lesson27.litvinov.thread;

import by.shag.lesson27.litvinov.Shop;

public class ProviderThread extends Thread {

    private final Shop shop;

    public ProviderThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.provideProduct();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
