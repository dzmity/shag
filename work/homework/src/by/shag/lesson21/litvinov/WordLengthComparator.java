package by.shag.lesson21.litvinov;

import java.util.Comparator;

public class WordLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int value = s1.length() - s2.length();
        if (value == 0) {
            value = 1;
        }
        return value;
    }
}
