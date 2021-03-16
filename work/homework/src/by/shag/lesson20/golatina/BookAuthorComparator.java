package by.shag.lesson20.golatina;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getAuthor() != null && o2.getAuthor() != null) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }

        Set<Author> authorSet1 = new TreeSet<>();
        Set<Author> authorSet2 = new TreeSet<>();

        if (o1.getAuthor() != null) {
            authorSet1.add(o1.getAuthor());
            authorSet2 = o2.getAuthorSet();
        } else if (o2.getAuthor() != null) {
            authorSet1 = o1.getAuthorSet();
            authorSet2.add(o2.getAuthor());
        } else {
            authorSet1 = o1.getAuthorSet();
            authorSet2 = o2.getAuthorSet();
        }

        return authorSet1.toString().compareTo(authorSet2.toString());
    }

}
