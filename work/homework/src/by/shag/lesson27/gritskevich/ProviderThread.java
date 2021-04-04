package by.shag.lesson27.gritskevich;

public class ProviderThread implements Runnable {

    private Shop shop;

    public ProviderThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.setClothesQuantity();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
