package by.shag.lesson27.golatina;

public class Shop {

    private final int MAX_CAPACITY = 50;

    private int currentCapacity;

    public Shop(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public synchronized void customer() throws InterruptedException {
        while (currentCapacity < 1) {
            wait();
        }
        currentCapacity--;
        notifyAll();

    }

    public synchronized void provider() throws InterruptedException {
        while (currentCapacity > MAX_CAPACITY - 10) {
            wait();
        }
        currentCapacity += 10;
        notifyAll();
    }

}
