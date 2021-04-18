package by.shag.lesson27.danilovich.six;

public class ProviderThread implements Runnable {

    private final Shop shop;

    public ProviderThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.setProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
