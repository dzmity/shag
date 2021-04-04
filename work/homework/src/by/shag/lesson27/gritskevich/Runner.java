package by.shag.lesson27.gritskevich;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

//        WithFourParametersMethod withFourParametersMethod = new WithFourParametersMethod();
//        withFourParametersMethod.threadsCreate(5, " имя потока", 2, true);

        List<String> stringArrayList = new ArrayList<>();
        String str = "ублюдокматьтвоюануидисюдаговнособачьечерешилменятрахнутьятебясамтрахну";
        for (int i = 0; i < str.length(); i++) {
            stringArrayList.add(String.valueOf(str.charAt(i)));
        }

        WithStringMassiveMethod withStringMassiveMethod = new WithStringMassiveMethod(stringArrayList);
        try {
            withStringMassiveMethod.filesCreate();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        List<Integer> integerArrayList = new ArrayList<>();
//        int arraySize = 3_400;
//        for (int i = 0; i < arraySize; i++) {
//            integerArrayList.add((int) ((Math.random() * 1_000) - 500));
//        }
//
//        WithIntMassMethod withIntMassMethod = new WithIntMassMethod(integerArrayList);
//        withIntMassMethod.getSumOfMass();

//        ReadFileThread readFileThread = new ReadFileThread();
//        Thread readThread = new Thread(readFileThread);

//        for (int i = 0; i < 5; i++) {
//            Exchanger<String> exchanger = new Exchanger<>();
//            new Thread(new ReadFileThread(exchanger)).start();
//            new Thread(new WriteFileThread(exchanger)).start();
//        }

        // С копированием не справился, копируется только первая строчка и все, не додумался до верного рещения. Извините)


//        Shop shop = new Shop(25);
//
//        for (int i = 0; i < 1000; i++) {
//            CustomerThread customerThread = new CustomerThread(shop);
//            new Thread(customerThread).start();
//        }
//
//        for (int i = 0; i < 100; i++) {
//            ProviderThread providerThread = new ProviderThread(shop);
//            new Thread(providerThread).start();
//        }

    }
}
