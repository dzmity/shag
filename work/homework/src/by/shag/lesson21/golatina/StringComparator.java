package by.shag.lesson21.golatina;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String string1, String string2) {
        if (string1 == null || string2 == null) {
            return 0;
        }
        return (string1.length() - string2.length());
    }

}
