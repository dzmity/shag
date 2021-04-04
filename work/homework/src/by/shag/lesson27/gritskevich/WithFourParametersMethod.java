package by.shag.lesson27.gritskevich;

import java.util.ArrayList;
import java.util.List;

public class WithFourParametersMethod extends Thread {

    @Override
    public void run() {
        super.run();
    }

    public void threadsCreate(int threadsQuantity, String desc, int iterationQuantity, boolean createEndString) {

        if (threadsQuantity > 0) {

            List<WithFourParametersMethod> threadsList = new ArrayList<>();

            for (int i = 0; i < threadsQuantity; i++) {
                WithFourParametersMethod withFourParametersMethod = new WithFourParametersMethod();
                withFourParametersMethod.start();
                threadsList.add(withFourParametersMethod);
            }

            for (int i = 0; i < iterationQuantity; i++) {
                for (int j = 0; j < threadsQuantity; j++) {
                    System.out.println(threadsList.get(j).getName() + desc);
                }
            }

            if (createEndString) {
                System.out.println("Конец");
            }
        }
    }
}
