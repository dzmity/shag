package by.shag.lesson27.litvinov;

import by.shag.lesson27.litvinov.thread.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        //task1
        generateNThreads(5, " java", 3, true);

        //task 2
        createFiles(new String[]{"a00", "a01", "a02", "a03", "a04", "a05", "a06", "a07", "a08", "a09",
                "a10", "a11", "a12", "a13", "a14"});

        //task 3
        int[] arrayOfNumbers = createArrayOfNumbers(4500);
        sumArrayElements(arrayOfNumbers);

        //task 4
        sumArrayElementsWithRepository(arrayOfNumbers);

        //task 5
        Repository repository = new Repository();
        Thread readThread = new ReadFileThread(repository);
        Thread writeThread = new WriteFileThread(repository);
        readThread.start();
        Thread.sleep(10L);
        writeThread.start();
        readThread.join();
        writeThread.join();
        System.out.println("Копирование завершено");

        //task 6
        Shop shop = new Shop(40);
        for (int i = 0; i < 1000; i++) {
            new CustomerThread(shop).start();
        }
        for (int i = 0; i < 100; i++) {
            new ProviderThread(shop).start();
        }
    }

    //method 1
    private static void generateNThreads(int number1, String str, int number2, boolean waitingAllThreads)
            throws InterruptedException {

        Thread[] threads = new Thread[number1];
        for (int i = 0; i < number1; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < number2; j++) {
                        System.out.println(getName() + str);
                    }
                }
            };
            threads[i] = thread;
            thread.start();
        }

        if (waitingAllThreads) {
            for (Thread thread : threads) {
                thread.join();
            }
        }
        System.out.println("End!");
        System.out.println();
    }

    //method 2
    private static void createFiles(String[] arrayOfStrings) {

        int arrayLength = arrayOfStrings.length;

        List[] lists = new List[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};

        for (int i = 0; i < arrayLength; i += 4) {
            lists[0].add(arrayOfStrings[i]);

            if ((i + 1) == arrayLength) break;
            lists[1].add(arrayOfStrings[i + 1]);

            if ((i + 2) == arrayLength) break;
            lists[2].add(arrayOfStrings[i + 2]);

            if ((i + 3) == arrayLength) break;
            lists[3].add(arrayOfStrings[i + 3]);

            if ((i + 4) == arrayLength) break;
        }

        FileManager.createDir();
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            Thread thread = new Thread() {
                @Override
                public void run() {
                    for (Object list : lists[finalI]) {
                        String fileName = list + ".txt";
                        FileManager.createFile(fileName);
                    }
                }
            };
            thread.start();
        }
    }

    //method 3
    private static void sumArrayElements(int[] arrayOfNumbers) {
        int subListsAmount = (int) (Math.ceil((double) arrayOfNumbers.length / 1000));
        List[] lists = divideArray(arrayOfNumbers, subListsAmount);

        for (int i = 0; i < subListsAmount; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int sum = 0;
                    for (Object number : lists[finalI]) {
                        sum += (int) number;
                    }
                    System.out.println(sum);
                }
            }).start();
        }
    }

    //method for 3 and 4 methods
    private static int[] createArrayOfNumbers(int numberOfElements) {
        int[] arrayOfNumbers = new int[numberOfElements];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = ((int) (Math.random() * numberOfElements + 1));
        }
        return arrayOfNumbers;
    }

    //method for 3 and 4 methods
    private static List[] divideArray(int[] arrayOfNumbers, int subListsAmount) {
        List[] lists = new List[subListsAmount];
        for (int i = 0; i < subListsAmount; i++) {
            lists[i] = new ArrayList<>();
            int jStart = i * 1000;
            int jEnd = 1000 + i * 1000;
            for (int j = jStart; j < jEnd; j++) {
                if (j == arrayOfNumbers.length) break;
                lists[i].add(arrayOfNumbers[j]);
            }
        }
        return lists;
    }

    //method 4
    private static void sumArrayElementsWithRepository(int[] arrayOfNumbers) throws InterruptedException {
        int subListsAmount = (int) (Math.ceil((double) arrayOfNumbers.length / 1000));
        List[] lists = divideArray(arrayOfNumbers, subListsAmount);

        Repository repository = new Repository();
        Thread[] threads = new Thread[subListsAmount];
        for (int i = 0; i < subListsAmount; i++) {
            Thread thread = new Thread(new AddValueInRepositoryThread(repository, lists[i]));
            thread.start();
            threads[i] = thread;
        }

        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println(repository.getSum());
    }
}
