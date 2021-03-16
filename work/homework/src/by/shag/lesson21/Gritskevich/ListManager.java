package by.shag.lesson21.Gritskevich;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListManager {

    public List<String> createStringArrayListWithSortWordLength() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("abcdefg");
        listOfString.add("cbcdef");
        listOfString.add("ebc");
        listOfString.add("bbcd");
        listOfString.add("db");
        System.out.println(listOfString);
        listOfString.sort(new ListStringComparatorLengthOfWord());
        return listOfString;
    }

    public List<String> createStringArrayListWithSortFirstChar() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("ahsdfahtah");
        listOfString.add("ctskdv");
        listOfString.add("dtyh");
        listOfString.add("eplkpp");
        listOfString.add("bef");
        System.out.println(listOfString);
        listOfString.sort(new ListStringComparatorFirstChar());
        return listOfString;
    }

    public List<String> createStringArrayListWithSortLastChar() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("ahsdfahta");
        listOfString.add("ctskdg");
        listOfString.add("dtyh");
        listOfString.add("eplkpc");
        listOfString.add("bef");
        System.out.println(listOfString);
        listOfString.sort(new ListStringComparatorLastChar());
        return listOfString;
    }

    public List<String> createStringArrayListWithSortWordLengthInvert() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("abcdefg");
        listOfString.add("cbcdef");
        listOfString.add("ebc");
        listOfString.add("bbcd");
        listOfString.add("db");
        System.out.println(listOfString);
        class ListStringComparatorLengthOfWordInvert implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length()) * (-1);
            }
        }
        listOfString.sort(new ListStringComparatorLengthOfWordInvert());
        return listOfString;
    }

    public List<String> createStringArrayListWithSortFirstCharInvert() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("ahsdfahtah");
        listOfString.add("ctskdv");
        listOfString.add("dtyh");
        listOfString.add("eplkpp");
        listOfString.add("bef");
        System.out.println(listOfString);
        Comparator<String> listStringComparatorFirstCharInvert = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) * (-1);
            }
        };
        listOfString.sort(listStringComparatorFirstCharInvert);
        return listOfString;
    }

    public List<String> createStringArrayListWithSortLastCharInvert() {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("ahsdfahta");
        listOfString.add("ctskdg");
        listOfString.add("dtyh");
        listOfString.add("eplkpc");
        listOfString.add("bef");
        System.out.println(listOfString);
        Comparator<String> listStringComparatorLastCharInvert = (o1, o2) -> {
            Character c1 = o1.charAt(o1.length() - 1);
            Character c2 = o2.charAt(o2.length() - 1);
            return c1.compareTo(c2) * (-1);
        };
        listOfString.sort(listStringComparatorLastCharInvert);
        return listOfString;
    }

    static class ListStringComparatorFirstChar implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }

    public class ListStringComparatorLastChar implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            Character c1 = o1.charAt(o1.length() - 1);
            Character c2 = o2.charAt(o2.length() - 1);
            return c1.compareTo(c2);
        }
    }
}
