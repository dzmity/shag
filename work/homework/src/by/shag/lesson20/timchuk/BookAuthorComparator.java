package by.shag.lesson20.timchuk;


import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        Author a1 = (Author) b1.getAuthors().toArray()[0];
        Author a2 = (Author) b2.getAuthors().toArray()[0];
        return a1.getAuthorSurname().compareToIgnoreCase(a2.getAuthorSurname());
    }
}

