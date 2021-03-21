package by.shag.lesson21.kletsko;

import java.util.Comparator;

public class SortComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return (str1.length() - str2.length());
    }
}
