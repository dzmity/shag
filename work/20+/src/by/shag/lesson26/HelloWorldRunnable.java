package by.shag.lesson26;

public class HelloWorldRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
