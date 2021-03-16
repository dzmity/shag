package by.shag.lesson21.shustova;

import java.util.Comparator;

public class ManagerSortLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String manager1, String manager2) {
        return manager1.length() - manager2.length();
    }
}
