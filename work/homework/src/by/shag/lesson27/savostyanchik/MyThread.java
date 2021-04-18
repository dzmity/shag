package by.shag.lesson27.savostyanchik;

import java.util.List;

public class MyThread extends Thread {
    private int result;


    public MyThread(List<Integer> list) {

        for (int number : list) {
            result += number;
        }
    }

    public MyThread(List<Integer> list, RepositoryThread obj) {

        for (int number : list) {
            result += number;
        }

        obj.setResultsThreads(result);
    }

    @Override
    public void run() {
        System.out.println(getName() + " Summ: " + result);
    }
}