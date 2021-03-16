package by.shag.lesson20.litvinov.comparators;

import by.shag.lesson20.litvinov.Book;

import java.util.Comparator;

public class NameOfIllustratorReverseAlphabeticalComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {

        if (book1.getListIllustrator() == null) {
            return -1;
        }
        if (book2.getListIllustrator() == null) {
            return 1;
        }
        return book1.getListIllustrator().first().compareTo(book2.getListIllustrator().first());
    }
}
