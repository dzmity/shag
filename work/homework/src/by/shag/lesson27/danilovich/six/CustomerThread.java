package by.shag.lesson27.danilovich.six;

public class CustomerThread implements Runnable {

    private final Shop shop;

    public CustomerThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.getProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
