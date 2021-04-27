package by.shag.lesson32.karpovich;

import java.util.Comparator;

public class PeopleNameComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
