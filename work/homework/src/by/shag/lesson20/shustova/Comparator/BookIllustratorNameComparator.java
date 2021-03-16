package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.Book;
import by.shag.lesson20.shustova.Illustrator;

import java.util.Comparator;

public class BookIllustratorNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        Illustrator illustrator1;
        Illustrator illustrator2;
        if (book1.getIteratorIllustratorList().hasNext()) {
            illustrator1 = book1.getIteratorIllustratorList().next();
        } else {
            return -1;
        }
        if (book2.getIteratorIllustratorList().hasNext()) {
            illustrator2 = book2.getIteratorIllustratorList().next();
        } else {
            return -1;
        }
        return illustrator1.compareTo(illustrator2);
    }
}
