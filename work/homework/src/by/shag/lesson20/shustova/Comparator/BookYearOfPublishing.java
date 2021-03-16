package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.Book;

import java.util.Comparator;

public class BookYearOfPublishing implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getYearOfPublishing() - book2.getYearOfPublishing();
    }
}
