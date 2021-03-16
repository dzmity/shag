package by.shag.lesson20.timchuk;

import java.util.Comparator;

public class BookIllustratorComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {

        if (b1.getIllustrators() == null) {
            return -1;
        }
        if (b2.getIllustrators() == null) {
            return 1;
        } else {
            Illustrator i1 = (Illustrator) b1.getIllustrators().toArray()[0];
            Illustrator i2 = (Illustrator) b2.getIllustrators().toArray()[0];
            return -1 * i1.getIllustratorName().compareToIgnoreCase(i2.getIllustratorName());
        }
    }
}
