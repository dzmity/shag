package by.shag.lesson21.golatina;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListManager {

    private static final String PUNCTUATION_MARKS = ",.!?:;-()+=/*";

    public String sentence;

    public ListManager(String sentence) {
        this.sentence = sentence;
    }

    private static List<String> doListFromString(String sentence, Comparator<String> comparator) {
        if (sentence == null || sentence.equals("")) {
            return Collections.singletonList("");
        }
        for (Character character : PUNCTUATION_MARKS.toCharArray()) {
            sentence = sentence.replace(character.toString(), "");
            sentence = sentence.replace("  ", " ");
        }
        List<String> sortingList = Arrays.asList(sentence.split(" "));
        sortingList.sort(comparator);
        return sortingList;
    }

    public static List<String> sortStringByLengthWords(String sentence) {
        return doListFromString(sentence, new StringComparator());
    }

    public static List<String> sortStringByAlphabetFirstLetter(String sentence) {
        return doListFromString(sentence, new AlphabetComparatorFirstLetter());
    }

    public static List<String> sortStringByLengthWordsReverse(String sentence) {
        class SortComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                return (o2.length() - o1.length());
            }
        }
        return doListFromString(sentence, new SortComparator());
    }

    public static List<String> sortStringByAlphabetFirstLetterReverse(String sentence) {
        return doListFromString(sentence, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });
    }

    public List<String> sortStringByAlphabetLastLetter() {
        return doListFromString(sentence, new AlphabetComparatorLastLetter());
    }

    public List<String> sortStringByAlphabetLastLetterReverse() {
        return doListFromString(sentence, (Comparator<String>) (o1, o2) -> {
            StringBuilder stringBuilder1 = new StringBuilder(o1).reverse();
            StringBuilder stringBuilder2 = new StringBuilder(o2).reverse();
            return stringBuilder2.toString().compareToIgnoreCase(stringBuilder1.toString());
        });
    }

    static class AlphabetComparatorFirstLetter implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    }

    private class AlphabetComparatorLastLetter implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            StringBuilder stringBuilder1 = new StringBuilder(o1).reverse();
            StringBuilder stringBuilder2 = new StringBuilder(o2).reverse();
            return stringBuilder1.toString().compareToIgnoreCase(stringBuilder2.toString());
        }
    }
}
