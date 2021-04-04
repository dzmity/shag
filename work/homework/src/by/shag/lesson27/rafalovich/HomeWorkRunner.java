package by.shag.lesson27.rafalovich;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import by.shag.lesson27.rafalovich.task5.ReadFileThread;
import by.shag.lesson27.rafalovich.task5.StringHolder;
import by.shag.lesson27.rafalovich.task5.WriteFileThread;
import by.shag.lesson27.rafalovich.task6.CustomerThread;
import by.shag.lesson27.rafalovich.task6.ProviderThread;
import by.shag.lesson27.rafalovich.task6.Shop;

public class HomeWorkRunner {

    public static void main(String[] args) throws InterruptedException {

        generateThreads(15, "yep", 100, true);
        createFilesFromList(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        calculateSeparateSumFromList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        calculateSumFromList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        copyFile();
        createShop();
    }

    private static void generateThreads(int threadQuantity, String message, int cycleQuantity, boolean joinFlag)
            throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadQuantity; i++) {
            Thread tread = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < cycleQuantity; j++) {
                        System.out.println(getName() + " " + message);
                    }
                }
            };
            tread.start();
            threads.add(tread);
        }

        if (joinFlag) {
            for (Thread thread : threads) {
                thread.join();
            }
        }
        System.out.println("The End");
    }

    private static void createFilesFromList(List<Integer> userArrayList) {

        // не будем обрабатывать кол-во меньше 4
        int threadsQuantity = 4;
        int filesQuantity = userArrayList.size();
        int halfPoint = filesQuantity / 2;
        int firstQuarterPoint = halfPoint / 2;
        int thirdQuarterPoint = halfPoint + (filesQuantity - halfPoint) / 2;

        Thread firstThread = new FileCreatorThread(userArrayList, 1, firstQuarterPoint);
        Thread secondThread = new FileCreatorThread(userArrayList, firstQuarterPoint + 1, halfPoint);
        Thread thirdThread = new FileCreatorThread(userArrayList, halfPoint + 1, thirdQuarterPoint);
        Thread fourthThread = new FileCreatorThread(userArrayList, thirdQuarterPoint + 1, filesQuantity);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        fourthThread.start();
    }


    private static void calculateSeparateSumFromList(List<Integer> userArrayList) {

        int portion = 4;
        boolean multipleOf1000 = (userArrayList.size() % portion) == 0;
        int threadQuantity = userArrayList.size() / portion;
        if (!multipleOf1000) {
            threadQuantity++;
        }
        for (int i = 0; i < threadQuantity; i++) {
            int startPoint = i * portion;
            int lastPoint = (i + 1) * portion;
            if (i == threadQuantity - 1) {
                lastPoint = userArrayList.size();
            }
            Runnable runnable = new SimpleSumCalculator(userArrayList.subList(startPoint, lastPoint));
            new Thread(runnable).start();
        }
    }

    private static void calculateSumFromList(List<Integer> userArrayList) throws InterruptedException {

        int portion = 4;
        boolean multipleOf1000 = (userArrayList.size() % portion) == 0;
        int threadQuantity = userArrayList.size() / portion;
        if (!multipleOf1000) {
            threadQuantity++;
        }

        AtomicLong sum = new AtomicLong(0);
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadQuantity; i++) {
            int startPoint = i * portion;
            int lastPoint = (i + 1) * portion;
            if (i == threadQuantity - 1) {
                lastPoint = userArrayList.size();
            }
            Runnable runnable = new SumCalculator(userArrayList.subList(startPoint, lastPoint), sum);
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Total sum = " + sum.get());
    }

    private static void copyFile() throws InterruptedException {
        StringHolder holder = new StringHolder();
        ReadFileThread readFileThread = new ReadFileThread(holder);
        readFileThread.start();
        Thread.sleep(1000L);
        WriteFileThread writeFileThread = new WriteFileThread(holder);
        writeFileThread.start();
        readFileThread.join();
        writeFileThread.join();
        System.out.println("Копирование завершено");
    }

    private static void createShop() {
        Shop shop = new Shop(25);

        for (int i = 0; i < 1000; i++) {
            CustomerThread customerThread = new CustomerThread(shop, 1);
            customerThread.start();
        }

        for (int i = 0; i < 100; i++) {
            ProviderThread providerThread = new ProviderThread(shop, 10);
            providerThread.start();
        }
    }
}
