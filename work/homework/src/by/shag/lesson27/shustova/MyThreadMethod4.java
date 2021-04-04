package by.shag.lesson27.shustova;

public class MyThreadMethod4 implements Runnable {

    private int[] buffer;
    private Repository repository;

    MyThreadMethod4(int[] buffer, Repository repository) {
        this.buffer = buffer;
        this.repository = repository;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int element : buffer) {
            sum += element;
        }
        System.out.println(Thread.currentThread().getName() + " Сумма элементов массива = " + sum);
        repository.addSumThread(sum);
    }
}

