package by.shag.lesson21.Gritskevich;

import java.util.Comparator;

public class ListStringComparatorLengthOfWord implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
