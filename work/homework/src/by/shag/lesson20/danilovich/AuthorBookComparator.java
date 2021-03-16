package by.shag.lesson20.danilovich;

import java.util.Comparator;

public class AuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = 0;
        Author a1 = (Author) o1.getAuthors().toArray()[0];
        Author a2 = (Author) o2.getAuthors().toArray()[0];
        result = a1.getLastname().compareToIgnoreCase(a2.getLastname());
        if (result == 0) {
            result = a1.getName().compareTo(a2.getName());
        }
        return result;
    }
}
