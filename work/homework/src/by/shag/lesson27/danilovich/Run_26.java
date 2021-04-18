package by.shag.lesson27.danilovich;

import by.shag.lesson27.danilovich.hide.ReadFileThread;
import by.shag.lesson27.danilovich.hide.WriteFileThread;
import by.shag.lesson27.danilovich.six.CustomerThread;
import by.shag.lesson27.danilovich.six.ProviderThread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run_26 {

    public static void main(String[] args) throws InterruptedException {

//        oneThread(2, "поток", 2, true);
//        methodTwo(new String[]{"Dima", "Viktor", "Oleg", "Kristina", "Marina", "Jena", "Alla", "Tania"});
//        {
//            int[] mass = new int[2255];
//            for (int i = 0; i < mass.length; i++) {
//                mass[i] = (int) (Math.random() * 650);
//            }
//            getMethodTree(mass);
//        }
//        {
//            int[] mass = new int[2255];
//            for (int i = 0; i < mass.length; i++) {
//                mass[i] = (int) (Math.random() * 650);
//            }
//            getMethodFour(mass);
//        }
//        getMethodHide();

//        getMethodSix(25);

    }

    private static void oneThread(int countThread, String text, int countFor, boolean logic) {

        Thread[] mass = new Thread[countThread];
        for (int i = 0; i < countThread; i++) {
            mass[i] = new Thread() {
                public void run() {
                    for (int j = 0; j < countFor; j++) {
                        System.out.println(getName() + " " + text);
                    }
                }
            };
            mass[i].start();
        }
        if (logic) {
            for (Thread thread : mass) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("END...");
    }

    private static void methodTwo(String[] mass) {

        List<String>[] list = new List[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};

        for (int i = 0; i < mass.length; i++) {
            if ((i % 4) == 0) {
                list[0].add(mass[i]);
            } else if ((i % 4) == 1) {
                list[1].add(mass[i]);
            } else if ((i % 4) == 2) {
                list[2].add(mass[i]);
            } else {
                list[3].add(mass[i]);
            }
        }

        for (int i = 0; i < 4; i++) {
            Thread thread = new MethodTwo(list[i]);
            thread.start();
        }
    }

    private static void getMethodTree(int[] mass) {

        int result = (int) Math.ceil(mass.length / 1000.0);
        List<Integer>[] list = new List[result];

        for (int i = 0, p = 1000, q = 0; i < result; i++) {
            list[i] = new ArrayList<>();
            for (int j = 0; j < mass.length; j++) {
                if (q == mass.length) {
                    break;
                }
                if (q < p) {
                    list[i].add(mass[q]);
                    q++;
                }
            }
            p += 1000;
        }


        for (int i = 0; i < result; i++) {
            Thread thread = new Thread(new MethodTree(list[i]));
            thread.start();
        }
    }

    private static void getMethodFour(int[] mass) throws InterruptedException {

        int result = (int) Math.ceil(mass.length / 1000.0);
        List<Integer>[] list = new List[result];

        for (int i = 0, p = 1000, q = 0; i < result; i++) {
            list[i] = new ArrayList<>();
            for (int j = 0; j < mass.length; j++) {
                if (q == mass.length) {
                    break;
                }
                if (q < p) {
                    list[i].add(mass[q]);
                    q++;
                }
            }
            p += 1000;
        }

        String dirName = System.getProperty("user.dir");
        File file = new File(dirName + File.separator + "sum.txt");

        Thread thread = null;
        for (int i = 0; i < result; i++) {
            thread = new Thread(new MethodFour(list[i]));
            thread.start();
        }

        assert thread != null;
        thread.join();

        if (!thread.isAlive()) {
            try {
                Scanner scanner = new Scanner(file);
                int su = 0;
                while (scanner.hasNext()) {
                    su += scanner.nextInt();
                }
                System.out.println(su);
                file.delete();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    private static void getMethodHide() throws InterruptedException {
        ReadFileThread read = new ReadFileThread();
        Thread threadR = new Thread(read);
        threadR.start();
        threadR.join();

        WriteFileThread write = new WriteFileThread(read.getMass());
        Thread threadW = new Thread(write);
        threadW.start();
        threadW.join();
        System.out.print("Копирование завершено");
    }

    private static <Shop> void getMethodSix(int a) {

        by.shag.lesson27.danilovich.six.Shop shop = new by.shag.lesson27.danilovich.six.Shop(a);
        for (int i = 0; i < 1000; i++) {
            Thread cus = new Thread(new CustomerThread(shop));
            cus.start();
        }

        for (int i = 0; i < 100; i++) {
            Thread pro = new Thread(new ProviderThread(shop));
            pro.start();
        }
    }

}
