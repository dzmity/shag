package by.shag.lesson20.Kletsko;

import java.util.Comparator;

public class BookBidingType implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBindType().ordinal() - (o2.getBindType().ordinal());
    }
}
