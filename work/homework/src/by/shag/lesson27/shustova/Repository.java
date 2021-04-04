package by.shag.lesson27.shustova;

public class Repository {
    private int sum;

    public synchronized void addSumThread(int sum) {
        this.sum += sum;
        System.out.println("Накапливаемая сумма = " + this.sum);
    }
}
