package by.shag.lesson20.Kletsko;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookSurnameAuthor implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        Set<Author> author = new TreeSet<>();
        Set<Author> author2 = new TreeSet<>();

        if (b1.getAuthor() != null) {
            author.add((Author) b1.getAuthor());
            author2 = b2.getAuthor();
        } else if (b2.getAuthor() != null) {
            author = b1.getAuthor();
            author2.add((Author) b2.getAuthor());
        } else {
            author = b1.getAuthor();
            author2 = b2.getAuthor();
        }

        if (author.size() == 0) {
            if (author2.size() == 0) {
                return 0;
            }
            return -1;
        } else if (author2.size() == 0) {
            return 1;
        }

        for (Author author11 : author) {
            for (Author author22 : author2) {
                if (author11 != author22) {
                    return author11.compareTo(author22);
                }
            }
        }

        return 0;
    }
}
