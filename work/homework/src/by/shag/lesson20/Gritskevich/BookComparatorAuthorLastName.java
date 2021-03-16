package by.shag.lesson20.Gritskevich;

import java.util.Comparator;

public class BookComparatorAuthorLastName implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthorSet().iterator().next().compareTo(o2.getAuthorSet().iterator().next());
    }
}
