package by.shag.lesson27.golatina;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Thread.sleep;

public class Runner {

    public static volatile String lineTransfer = "Я не понимаю, как корректно засинхронизировать два потока по условиям задачи.";

    public static void main(String[] args) throws InterruptedException, IOException {

//        generateThreadFromUserData((int) (Math.random() * 6 + 5), "print", (int) (Math.random() * 7 + 4), (int) (Math.random() * 2) == 0);


        ArrayList<String> arrayNamesForFile = new ArrayList<>();
        String randomString = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        for (int i = 0; i < (int) (Math.random() * 151 + 50); i++) {
            arrayNamesForFile.add(i, "" + randomString.charAt((int) (Math.random() * randomString.length())) + randomString.charAt((int) (Math.random() * randomString.length()))
                    + randomString.charAt((int) (Math.random() * randomString.length())));
        }
        System.out.println("\nРазмер массива строк для создания файлов в папке /golatinaArray = " + arrayNamesForFile.size());
        createFilesWithThreadFromUserArray(arrayNamesForFile);


        ArrayList<Integer> arrayIntegerForSum = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random() * 5001 + 5000); i++) {
            arrayIntegerForSum.add((int) (Math.random() * 2001));
        }
        int sum = 0;
        for (int i : arrayIntegerForSum) {
            sum += i;
        }
        System.out.println("\nРазмер массива чисел для подсчета суммы = " + arrayIntegerForSum.size() + ". Сумма чисел массива = " + sum);
        getSumUpTheNumbers(arrayIntegerForSum);


        getSumUpTheNumbersExtends(arrayIntegerForSum);


        File fileFrom = new File(System.getProperty("user.dir") + "\\by\\shag\\lesson27\\golatina\\from.txt");
        File fileTo = new File(System.getProperty("user.dir") + "\\by\\shag\\lesson27\\golatina\\to.txt");
        ReadFileThread readFileThread = new ReadFileThread(fileFrom);
        WriteFileThread writeFileThread = new WriteFileThread(fileTo);
        readFileThread.start();
        writeFileThread.start();
        while (readFileThread.isAlive() && writeFileThread.isAlive()) {
            sleep(1);
        }
        System.out.println("Копирование завершено");


        Shop shop = new Shop((int) (Math.random() * 51));
        System.out.println("Исходное количество товара в магазине = " + shop.getCurrentCapacity());
        for (int i = 0; i < 1000; i++) {
            new CustomerThread(shop).start();
        }
        for (int i = 0; i < 100; i++) {
            new ProviderThread(shop).start();
        }

    }

    public static void generateThreadFromUserData(Integer numberOfThreads, String stringForPrint, Integer numberOfPrint, boolean printAfterProcess) throws InterruptedException {
        System.out.printf("numberOfThreads = %s, stringForPrint = %s, numberOfPrint = %s, printAfterProcess= %s\n", numberOfThreads, stringForPrint, numberOfPrint, printAfterProcess);
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < numberOfPrint; j++) {
                        System.out.printf(" %s=%s ", getName(), stringForPrint);
                    }
                }
            };
            thread.start();
            if (printAfterProcess) {
                thread.join();
            }
        }
        System.out.println("конец");
    }

    public static void createFilesWithThreadFromUserArray(ArrayList<String> userArrayList) {
        userArrayList.remove(0);
        File directory = new File(System.getProperty("user.dir") + "\\by\\shag\\lesson27\\golatina\\trashArray");
        directory.mkdir();
        int threadsCount = 4;
        int countForOneThread = userArrayList.size() / threadsCount;
        for (int i = 0; i < threadsCount; i++) {
            int startArrayPoint = i * countForOneThread;
            int finishArrayPoint = i != threadsCount - 1 ? startArrayPoint + countForOneThread : userArrayList.size();
            Thread thread = new Thread(() -> {
                for (int j = startArrayPoint; j < finishArrayPoint; j++) {
                    File file = new File(directory + File.separator + (userArrayList.get(j) + ".txt"));
                    if (!file.exists()) {
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            thread.start();
        }
    }

    public static void getSumUpTheNumbers(ArrayList<Integer> userIntegerArrayList) {
        int elementsForOneThread = 1000;
        int countForOneThread = userIntegerArrayList.size() % elementsForOneThread == 0 ?
                userIntegerArrayList.size() / elementsForOneThread : (1 + userIntegerArrayList.size() / elementsForOneThread);
        for (int i = 0; i < countForOneThread; i++) {
            Thread thread = new Thread(new runnableForGetSumUpTheNumbers(i, countForOneThread, elementsForOneThread, userIntegerArrayList));
            thread.start();
        }
    }

    public static void getSumUpTheNumbersExtends(ArrayList<Integer> userIntegerArrayList) throws InterruptedException {
        int elementsForOneThread = 1000;
        Integer finalSum = 0;
        int countForOneThread = userIntegerArrayList.size() % elementsForOneThread == 0 ?
                userIntegerArrayList.size() / elementsForOneThread : (1 + userIntegerArrayList.size() / elementsForOneThread);
        Map<Integer, Integer> threadMap = new HashMap<>();
        for (int i = 0; i < countForOneThread; i++) {
            Thread thread = new Thread(new runnableForGetSumUpTheNumbers(i, countForOneThread, elementsForOneThread, userIntegerArrayList) {
                @Override
                public void run() {
                    for (int j = startArrayPoint; j < finishArrayPoint; j++) {
                        sum += userIntegerArrayList.get(j);
                    }
                    threadMap.put(startArrayPoint / elementsForOneThread, sum);
                }
            });
            thread.start();
            thread.join();
        }
        for (int i = 0; i < threadMap.size(); i++) {
            finalSum += threadMap.get(i);
        }
        System.out.println("Результирующая сумма после расширения задания 3  = " + finalSum);
    }

    public static class runnableForGetSumUpTheNumbers implements Runnable {
        int startArrayPoint;
        int finishArrayPoint;
        int sum = 0;
        ArrayList<Integer> userIntegerArrayList;

        public runnableForGetSumUpTheNumbers(int i, int countForOneThread, int elementsForOneThread, ArrayList<Integer> userIntegerArrayList) {
            this.startArrayPoint = i * elementsForOneThread;
            this.finishArrayPoint = i != countForOneThread - 1 ? startArrayPoint + elementsForOneThread : userIntegerArrayList.size();
            this.userIntegerArrayList = userIntegerArrayList;
        }

        @Override
        public void run() {
            for (int i = startArrayPoint; i < finishArrayPoint; i++) {
                sum += userIntegerArrayList.get(i);
            }
            System.out.println(Thread.currentThread().getName() + ", sum = " + sum + " ");
        }
    }
}
