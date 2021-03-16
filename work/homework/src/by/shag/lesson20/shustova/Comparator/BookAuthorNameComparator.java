package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.Author;
import by.shag.lesson20.shustova.Book;

import java.util.Comparator;

public class BookAuthorNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        Author author1 = book1.getIteratorAuthorList().next();
        Author author2 = book2.getIteratorAuthorList().next();
        int result = 0;
        result = (author1 == null) ?
                (author2 == null ? 0 : -1) :
                author1.compareTo(author2);
        return result;
    }
}
