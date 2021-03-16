package by.shag.lesson20.shustova.Comparator;

import by.shag.lesson20.shustova.BindingType;
import by.shag.lesson20.shustova.Book;

import java.util.Comparator;

public class BookBindingTypeComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        BindingType type1 = book1.getBindingType();
        BindingType type2 = book2.getBindingType();
        return type1.ordinal() - type2.ordinal();
    }
}
