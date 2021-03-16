package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.Book;
import by.shag.lesson20.shustova.Genre;

import java.util.Comparator;

public class BookGenreComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        Genre genre1 = book1.getGenre();
        Genre genre2 = book2.getGenre();
        return genre1.name().compareTo(genre2.name());
    }
}
