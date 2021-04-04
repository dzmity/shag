package by.shag.lesson27.shustova;

import by.shag.lesson27.shustova.task5.ReadFileThread;
import by.shag.lesson27.shustova.task5.WriteFileThread;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] str) {

        //startThread(10, "I'm a pirate", 2, true);

        //2
        int quantityOfFiles = 40;
        String[] mas = new String[quantityOfFiles];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = String.valueOf(i);
        }
        startThreadFile(mas);

        //3
        /*int[] mas = new int[5002];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11 + 1);
        }
        sumInThread(mas);*/

        //4
        /*int[] mas = new int[12];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 11 + 1);
        }
        sumInThreadWithRepository(mas);*/

        //5.
        List<String> allLines = new ArrayList<>();

        new Thread(new ReadFileThread(allLines)).start();
        new Thread(new WriteFileThread(allLines)).start();

        try {
            Thread.currentThread().join(1_000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Копирование завершено");

        //6.
        /*Shop shop = new Shop(5);
        System.out.println("Старт = " + shop.getProduct());
        for (int i = 0; i < 100; i++) {
            Thread thr1 = new Thread(new ProviderThread(shop, 10));
            thr1.setDaemon(true);
            thr1.start();
        }
        for (int i = 0; i < 1000; i++) {
            Thread thr2 = new Thread(new CustomerThread(shop, 1));
            thr2.setDaemon(true);
            thr2.start();
        }
        try {
            Thread.currentThread().join(1_000L);
            Thread.currentThread().interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End...Количество = " + shop.getProduct());*/
    }

    //1.
    private static void startThread(int quantityOfThreads, String message,
                                    int quantityOfСycles, boolean isEndThreads) {
        for (int i = 0; i < quantityOfСycles; i++) {
            for (int j = 0; j < quantityOfThreads; j++) {
                Thread tread = new Thread() {
                    @Override
                    public void run() {
                        System.out.println(getName() + " " + message);
                    }
                };
                tread.setDaemon(true);
                tread.start();
            }
        }
        if (isEndThreads) {
            try {
                Thread.currentThread().join(1_000L);
                Thread.currentThread().interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End...");
    }

    //2.
    private static String fullFilePath(String nameFile) {
        String dirName = System.getProperty("user.dir");
        return dirName + File.separator + nameFile + ".txt";
    }

    private static void createFile(String file) {
        String nameFile = fullFilePath(file);
        try (OutputStream out = new FileOutputStream(nameFile)) {
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startThreadFile(String[] arr) {
        final int quantityOfThreads = 4;

        int quantityOfFile = arr.length / quantityOfThreads;
        int quantityOfFile2 = quantityOfFile;
        int lastThread = arr.length % quantityOfThreads + quantityOfFile;

        for (int i = 0; i < quantityOfThreads; i++) {
            if (i == quantityOfThreads - 1) {
                quantityOfFile = lastThread;
            }
            String[] buffer = new String[quantityOfFile];
            System.arraycopy(arr, i * quantityOfFile2, buffer, 0, quantityOfFile);

            Thread thread = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < buffer.length; j++) {
                        createFile(buffer[j]);
                    }
                }
            };
            thread.start();
        }
    }

    //3.
    private static void sumInThread(int[] arr) {
        int elementInThreads = 1000;
        int quantityOfThreads = arr.length / elementInThreads;
        int elementInThreads2 = elementInThreads;
        int lastThread = arr.length % quantityOfThreads + elementInThreads;

        for (int i = 0; i < quantityOfThreads; i++) {
            if (i == quantityOfThreads - 1) {
                elementInThreads = lastThread;
            }
            int[] buffer = new int[elementInThreads];
            System.arraycopy(arr, i * elementInThreads2, buffer, 0, elementInThreads);
            new Thread(new MyThreadMethod3(buffer)).start();
        }
    }

    //4.
    private static void sumInThreadWithRepository(int[] arr) {
        int elementInThreads = 3;
        int quantityOfThreads = arr.length / elementInThreads;
        int elementInThreads2 = elementInThreads;
        int lastThread = arr.length % quantityOfThreads + elementInThreads;

        Repository repository = new Repository();

        for (int i = 0; i < quantityOfThreads; i++) {
            if (i == quantityOfThreads - 1) {
                elementInThreads = lastThread;
            }
            int[] buffer = new int[elementInThreads];
            System.arraycopy(arr, i * elementInThreads2, buffer, 0, elementInThreads);
            new Thread(new MyThreadMethod4(buffer, repository)).start();
        }
    }
}


