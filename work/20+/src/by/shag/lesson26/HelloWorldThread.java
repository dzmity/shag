package by.shag.lesson26;

public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world from thread " + getName());
    }
}
