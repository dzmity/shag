package by.shag.lesson21;

import java.util.Comparator;
import java.util.List;

public class Book {

    private List<Author> authors;


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        authors.sort(new Author.NameComparator());
        this.authors = authors;
    }

    public static class AuthorComparator implements Comparator<Book> {

        @Override
        public int compare(Book book, Book t1) {
            return book.authors.get(0).lastName.compareTo(t1.authors.get(0).lastName);
        }
    }
}
