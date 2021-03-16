package by.shag.lesson20.golatina;

import java.util.Comparator;

public class BookIllustratorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {

        if (o1.getIllustratorSet() == null) {
            if (o2.getIllustratorSet() == null) {
                return 0;
            }
            return -1;
        } else if (o2.getIllustratorSet() == null) {
            return 1;
        }

        return o2.getIllustratorSet().toString().compareTo(o1.getIllustratorSet().toString());
    }

}
