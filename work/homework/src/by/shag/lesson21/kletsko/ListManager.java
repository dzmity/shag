package by.shag.lesson21.kletsko;

import java.util.*;

public class ListManager {

    public static List<String> sortList(List<String> str) {
        str.sort(new SortComparator());
        return str;
    }

    public static class SortListNested implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.charAt(0) - s2.charAt(0);
        }


    }

    public static List<String> sortListNested(List<String> str) {
        str.sort(new SortListNested());
        return str;
    }


    public class InnerSort implements Comparator<String> {

        public int compare(String s1, String s2) {
            return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1);
        }
    }

    public List<String> sortListInner(List<String> str) {
        str.sort(new InnerSort());
        return str;
    }

    public static List<String> localSort(List<String> str) {
        class LocalSort implements Comparator<String> {
            @Override
            public int compare(String s1, String s2) {
                return -1 * (s1.length() - s2.length());
            }
        }
        str.sort(new LocalSort());
        return str;
    }

    public static List<String> anonSort(List<String> str) {
        str.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -1 * (s1.charAt(0) - s2.charAt(0));
            }
        });
        return str;
    }

    public static List<String> lambdaSort(List<String> str) {
        str.sort((String s1, String s2) -> -1 * (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));
        return str;
    }
}
