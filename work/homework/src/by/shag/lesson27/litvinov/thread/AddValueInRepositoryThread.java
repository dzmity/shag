package by.shag.lesson27.litvinov.thread;

import by.shag.lesson27.litvinov.Repository;

import java.util.List;

public class AddValueInRepositoryThread implements Runnable {

    private final Repository repository;
    private final List<Integer> subList;

    public AddValueInRepositoryThread(Repository repository, List<Integer> subList) {
        this.repository = repository;
        this.subList = subList;
    }

    @Override
    public void run() {
        for (Integer number : subList) {
            repository.addValueInRepository(number);
        }
    }
}
