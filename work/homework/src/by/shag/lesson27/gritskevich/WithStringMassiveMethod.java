package by.shag.lesson27.gritskevich;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WithStringMassiveMethod extends Thread {

    private final int MAX_ITERATION = 10;
    private List<String> stringMass;

    public WithStringMassiveMethod(List<String> stringMass) {
        this.stringMass = stringMass;
    }

    @Override
    public void run() {
        List<String> stringList = new ArrayList<>();
        for (int j = 0; j < MAX_ITERATION; j++) {
            stringList.add(stringMass.get(0));
            stringMass.remove(0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stringList) {
            stringBuilder.append(s);
        }
        String fileName = stringBuilder.toString();
        File file = new File(System.getProperty("user.dir") + "/src/by/shag/lesson25"
                + File.separator + (fileName + ".txt"));
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void filesCreate() throws InterruptedException {

        WithStringMassiveMethod thread1 = new WithStringMassiveMethod(stringMass);
        WithStringMassiveMethod thread2 = new WithStringMassiveMethod(stringMass);
        WithStringMassiveMethod thread3 = new WithStringMassiveMethod(stringMass);
        WithStringMassiveMethod thread4 = new WithStringMassiveMethod(stringMass);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
