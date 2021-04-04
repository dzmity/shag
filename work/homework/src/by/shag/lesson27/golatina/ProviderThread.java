package by.shag.lesson27.golatina;

public class ProviderThread extends Thread {

    private Shop shop;

    public ProviderThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.provider();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
