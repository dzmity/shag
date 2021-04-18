package by.shag.lesson27.danilovich.six;

public class Shop {

    public static final Integer MAX_PRODUCT = 50;

    private int product;

    public Shop(int product) {
        this.product = product;
    }


    public synchronized void getProduct() throws InterruptedException {

        while (product < 1) {
            System.out.println("Нет товара");
            wait();
        }
        product--;
        System.out.println("______________________________________________________");
        System.out.println("Купили 1 еденицу товара.\nТовара на складе " + product);
        notifyAll();
    }

    public synchronized void setProduct() throws InterruptedException {

        while (product >= (MAX_PRODUCT - 10)) {
            if (product > MAX_PRODUCT) {
                System.out.println("Склад переполнен на: " + (product - MAX_PRODUCT));
            }
            wait();
        }
        product += 10;
        System.out.println("______________________________________________________");
        System.out.println("Привезли 10 едениц товара.\nТовара на скледе: [" + product + "]");
        notifyAll();
    }
}
