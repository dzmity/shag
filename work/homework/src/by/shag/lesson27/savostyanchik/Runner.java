package by.shag.lesson27.savostyanchik;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static final int MAXIMUM_NUMBER_ELEMENTS = 1000;
    private static final int MINIMUM_NUMBER_ELEMENTS = 1;
    private static int count = 0;


    public static void main(String[] args) throws InterruptedException {
        System.out.println("Task 1");
        creatingAndStartingThreads(5, "Thread: ", 1, true);


        System.out.println("-------------");
        System.out.println();
        Thread.sleep(1_000);


        System.out.println("Task 2");
        String[] names = new String[]{
                "1.txt",
                "2.txt",
                "3.txt",
                "4.txt",
                "5.txt",
                "6.txt",
                "7.txt",
                "8.txt",
                "9.txt",
                "10.txt",
                "11.txt"
        };


        creatingFilesUsingThreads(names);
        Thread.sleep(2_000);
        System.out.println("-------------");
        System.out.println();


        System.out.println("Task 3");
        int[] mass = new int[1001];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 11);
        }

        task3(mass);
        Thread.sleep(1_000);
        System.out.println("-------------");
        System.out.println();

        Thread.sleep(1_000);


        System.out.println("Task 4");
        task4(mass);
        System.out.println("-------------");


        System.out.println("Task 5");

        String text = "I hope, I did the fifth task correctly.";

        String fileName = "from.txt";
        String dirName = System.getProperty("user.dir");
        String fullName = dirName + File.separator + fileName;
        System.out.println("File path : " + fullName);
        File inputFile = new File(fullName);

        String fileName2 = "to.txt";
        String dirName2 = System.getProperty("user.dir");
        String fullName2 = dirName2 + File.separator + fileName2;
        System.out.println("File path : " + fullName2);
        File outputFile = new File(fullName2);


        try (OutputStream out = new FileOutputStream(inputFile);
             OutputStream out2 = new FileOutputStream(outputFile)) {
            out.write(text.getBytes());
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        ReadFileThread thread = new ReadFileThread(inputFile, outputFile);
        thread.start();
    }

    public static void creatingAndStartingThreads(int numberThreads, String line,
                                                  int count, boolean expectThreads) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();


        for (int i = 0; i < numberThreads; i++) {
            Thread thread = new Thread() {
                public void run() {
                    for (int i = 0; i < count; i++) {
                        System.out.println(line + this.getName());
                    }
                }
            };
            thread.start();

            threads.add(thread);
        }

        if (expectThreads) {
            for (Thread thread : threads) {
                thread.join();
            }
        }
        System.out.println("Конец!");
    } // Это первое задание

    public static void creatingFilesUsingThreads(String[] lines) {
        for (int i = 0; i < 4; i++) {
            MassThread threads = new MassThread(lines);
            threads.start();
        }
    } // Это второе задание

    public static void task3(int... mass) {
        if (count >= mass.length) {
            count = 0;
        }


        List<Thread> threads = new ArrayList<>();
        List<Integer> listInt = null;
        MyThread thread = null;


        if (mass.length < MINIMUM_NUMBER_ELEMENTS) {
            System.err.println("There are no elements, that can be processed by the thread!");
        }


        while (true) {

            if (count == mass.length) {
                break;
            }


            listInt = new ArrayList<>();

            for (int j = 0; j < MAXIMUM_NUMBER_ELEMENTS; j++) {

                if (mass.length == count) {
                    break;
                }


                listInt.add(mass[count]);
                count++;
            }

            thread = new MyThread(listInt);
            threads.add(thread);
        }


        for (Thread thread1 : threads) {
            thread1.start();
        }
    }

    public static void task4(int... mass) throws InterruptedException {
        if (count >= mass.length) {
            count = 0;
        }


        List<Thread> threads = new ArrayList<>();
        List<Integer> listInt = null;
        MyThread thread2 = null;
        RepositoryThread obj = new RepositoryThread();


        if (mass.length < MINIMUM_NUMBER_ELEMENTS) {
            System.err.println("There are no elements, that can be processed by the thread!");
        }


        while (true) {

            if (count == mass.length) {
                break;
            }


            listInt = new ArrayList<>();

            for (int j = 0; j < MAXIMUM_NUMBER_ELEMENTS; j++) {

                if (mass.length == count) {
                    break;
                }


                listInt.add(mass[count]);
                count++;
            }

            thread2 = new MyThread(listInt, obj);
            threads.add(thread2);
        }


        for (Thread thread3 : threads) {
            thread3.start();
            thread3.join();
        }


        System.out.printf("The overall result of all threads: %s %n", obj.getResultsThreads());
    }
}