package by.shag.lesson20.litvinov.comparators;

import by.shag.lesson20.litvinov.Book;

import java.util.Comparator;

public class TitleOfBookAlphabeticalComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
