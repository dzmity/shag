package by.shag.lesson21;

public interface Runable {

    String name = null;

    default void doThms(String str) {
        System.out.println(str);
    }

    void run();

    void run2();



}
