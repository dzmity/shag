package by.shag.lesson27.shustova;

public class MyThreadMethod3 implements Runnable {

    final private int[] buffer;

    MyThreadMethod3(int[] buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int element : buffer) {
            sum += element;
        }
        System.out.println(Thread.currentThread().getName() + " Сумма элементов массива = " + sum);
    }
}
