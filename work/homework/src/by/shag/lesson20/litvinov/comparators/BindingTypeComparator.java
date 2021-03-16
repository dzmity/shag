package by.shag.lesson20.litvinov.comparators;

import by.shag.lesson20.litvinov.Book;

import java.util.Comparator;

public class BindingTypeComparator implements Comparator<Book> {

    private final static String SOLID = "Твердый";
    private final static String SOFT = "Мягкий";
    private final static String OTHER = "Другой";

    private int getNumberOfBindingType(Book book) {
        int numberOfBindingType = 0;
        switch (book.getBookBindingType()) {
            case SOLID:
                numberOfBindingType = 1;
                break;
            case SOFT:
                numberOfBindingType = 2;
                break;
            case OTHER:
                numberOfBindingType = 3;
                break;
            default:
                break;
        }
        return numberOfBindingType;
    }

    @Override
    public int compare(Book book1, Book book2) {
        return getNumberOfBindingType(book1) - getNumberOfBindingType(book2);
    }
}
