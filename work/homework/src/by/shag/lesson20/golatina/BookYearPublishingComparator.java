package by.shag.lesson20.golatina;

import java.util.Comparator;

public class BookYearPublishingComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYearPublishing() - o2.getYearPublishing();
    }

}
