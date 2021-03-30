package by.shag.lesson26;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
//        thread();
        generate10Threads();
    }





    private static void thread() {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());
        System.out.println(thread.getThreadGroup());
        Arrays.stream(thread.getStackTrace()).forEach(System.out::println);
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.isDaemon());
        System.out.println(thread.isAlive());
        System.out.println(thread.isInterrupted());
    }

    private static void generate10Threads() {

        Thread thread = null;
        for (int i = 0; i < 10; i++) {
            // 1 way
//            Thread thread = new HelloWorldThread();
//            thread.start();


            // 2 way
            thread = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();

            // 3 way
            // lambda

            //4 way
            // shared stateless runnable //only read
        }
        System.out.println("Hello from main thread");
        System.out.println("Hello from main thread");
        System.out.println("Hello from main thread");
        System.out.println("Hello from main thread");
        System.out.println("Hello from main thread");
        thread.start();
    }
}
