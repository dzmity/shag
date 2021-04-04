package by.shag.lesson27.golatina;

public class CustomerThread extends Thread {

    private Shop shop;

    public CustomerThread(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            shop.customer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
