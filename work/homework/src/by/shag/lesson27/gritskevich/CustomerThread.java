package by.shag.lesson27.gritskevich;

public class CustomerThread implements Runnable {

    private Shop shop;

    public CustomerThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.getClothesQuantity();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
