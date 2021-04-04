package by.shag.lesson27.gritskevich;

public class Shop {

    private final int MAX_CLOTHES_QUANTITY = 50;
    private int clothesQuantity;

    public Shop(int clothesQuantity) {
        this.clothesQuantity = clothesQuantity;
    }

    public synchronized void getClothesQuantity() throws InterruptedException {
        while (clothesQuantity < 1) {
            System.out.println("Товара нет");
            wait();
        }
        clothesQuantity--;
        notifyAll();
    }

    public synchronized void setClothesQuantity() throws InterruptedException {
        while (clothesQuantity >= MAX_CLOTHES_QUANTITY) {
            System.out.println("Склад полон");
            wait();
        }
        clothesQuantity = clothesQuantity + 10;
        notifyAll();
    }
}
