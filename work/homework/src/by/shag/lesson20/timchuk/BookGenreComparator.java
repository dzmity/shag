package by.shag.lesson20.timchuk;

import java.util.Comparator;

public class BookGenreComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
         return b1.getGenre().toString().compareTo(b2.getGenre().toString());
    }
}
