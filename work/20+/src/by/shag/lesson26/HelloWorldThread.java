package by.shag.lesson26;

public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.print("Hello");
        System.out.print(" world");
        System.out.print(" from");
        System.out.println(" thread " + getName());

    }
}
