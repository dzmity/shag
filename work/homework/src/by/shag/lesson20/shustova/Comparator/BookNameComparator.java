package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.Book;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return (book1 == null) ?
                (book2 == null ? 0 : -1) :
                book1.getName().compareTo(book2.getName());
    }
}
