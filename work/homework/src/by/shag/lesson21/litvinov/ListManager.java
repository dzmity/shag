package by.shag.lesson21.litvinov;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListManager {

//1
    public static void compareListByWordLength(List<String> list) {
        WordLengthComparator comparator = new WordLengthComparator();
        list.sort(comparator);
    }

//2
    public static void compareListByFirstLetterAlphabetical(List<String> list) {
        NestedFirstLetterAlphabeticalComparator comparator = new NestedFirstLetterAlphabeticalComparator();
        list.sort(comparator);
    }

    public static class NestedFirstLetterAlphabeticalComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            int value = s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0);
            if (value == 0) {
                value = 1;
            }
            return value;
        }
    }

//3
    public static void compareLastLetterAlphabetical(List<String> list) {
        ListManager manager = new ListManager();
        InnerLastLetterAlphabeticalComparator lastLetterAlphabeticalComparator =
                manager.new InnerLastLetterAlphabeticalComparator();
        list.sort(lastLetterAlphabeticalComparator);
    }

    public class InnerLastLetterAlphabeticalComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            int value = s1.toLowerCase().charAt(s1.length()-1) - s2.toLowerCase().charAt(s2.length()-1);
            if (value == 0) {
                value = 1;
            }
            return value;
        }
    }

//4
    public static void compareListByWordLengthReverse(List<String> list) {
        class LocalListByWordLengthReverseComparator implements Comparator<String> {
            @Override
            public int compare(String str1, String str2) {
                int value = str2.length() - str1.length();
                if (value == 0 ) {
                    value = 1;
                }
                return value;
            }
        }
        LocalListByWordLengthReverseComparator comparator = new LocalListByWordLengthReverseComparator();
        list.sort(comparator);
    }

//5
    public static void compareListByFirstLetterReverseAlphabetical(List<String> list) {
        Set<String> strings = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                int value = str2.toLowerCase().charAt(0) - str1.toLowerCase().charAt(0);
                if (value==0) {
                    value = 1;
                }
                return value;
            }
        });
        strings.addAll(list);
        list.clear();
        list.addAll(strings);
    }

//*
    public static void compareListByLastLetterReverseAlphabetical(List<String> list) {
        list.sort((str1, str2) ->{
          int value = str2.toLowerCase().charAt(str2.length()-1) - str1.toLowerCase().charAt(str1.length()-1);
          if (value == 0) {
              value = 1;
          }
          return value;
        });
    }
}
