package by.shag.lesson20.Gritskevich;

import java.util.Comparator;

public class BookComparatorIllustratorName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getIllustratorSet() == null
                && o2.getIllustratorSet() == null) {
            return 0;
        } else if (o1.getIllustratorSet() == null) {
            return -1;
        } else if (o2.getIllustratorSet() == null) {
            return 1;
        } else {
            return o1.getIllustratorSet().iterator().next().getName()
                    .compareTo(o2.getIllustratorSet().iterator().next().getName());
        }
    }
}
