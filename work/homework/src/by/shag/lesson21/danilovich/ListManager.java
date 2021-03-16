package by.shag.lesson21.danilovich;

import java.util.*;

public class ListManager {

    public List<String> printSortSize(List<String> printSortSize) {
        printSortSize.sort(new SortString());
        return printSortSize;
    }

    public static class Nested implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Character.compare(o1.charAt(0), o2.charAt(0));
        }
    }

    public List<String> printSortAbc(List<String> printSortAbc) {
        printSortAbc.sort(new Nested());
        return printSortAbc;
    }

    class Inner implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return Character.compare(o1.toLowerCase().charAt(o1.length() - 1), o2.toLowerCase().charAt(o2.length() - 1));
        }
    }

    public List<String> printSortCba(List<String> printSortCba) {
        printSortCba.sort(new Inner());
        return printSortCba;
    }

    public List<String> printSortSizeReversal(List<String> printSortSizeReversal) {
        class Local implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        }
        printSortSizeReversal.sort(new Local());
        return printSortSizeReversal;
    }

    Nested anon = new Nested() {
        @Override
        public int compare(String o1, String o2) {
            return super.compare(o1, o2);
        }
    };

    public List<String> printSortAbcReversal(List<String> printSortAbcReversal) {
        printSortAbcReversal.sort(anon.reversed());
        return printSortAbcReversal;
    }
}

class SortString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
