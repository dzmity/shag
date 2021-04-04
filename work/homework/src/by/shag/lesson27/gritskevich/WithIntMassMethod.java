package by.shag.lesson27.gritskevich;

import java.util.List;

public class WithIntMassMethod implements Runnable {

    private final int THREAT_LIMITER = 1_000;
    private int threatQuantity;
    private List<Integer> integerList;
    private RepositoryOfSumElements repositoryOfSumElements;

    public WithIntMassMethod(List<Integer> integerList) {
        this.integerList = integerList;
        repositoryOfSumElements = new RepositoryOfSumElements();
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < THREAT_LIMITER; i++) {
            if (integerList.size() > 0) {
                sum += integerList.get(0);
                integerList.remove(0);
            }
        }
        System.out.println(sum);
        repositoryOfSumElements.setSum(sum + repositoryOfSumElements.getSum());
    }

    public void getSumOfMass() {

        threatQuantity = (integerList.size() / THREAT_LIMITER) + 1;

        for (int i = 0; i < threatQuantity; i++) {
            Thread thread = new Thread(this);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(repositoryOfSumElements.getSum());
    }
}
