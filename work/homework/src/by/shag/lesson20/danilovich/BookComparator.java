package by.shag.lesson20.danilovich;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = 0;
        result = o1.getYearOfPublishing() - o2.getYearOfPublishing();
        if (result == 0) {
            result = o1.getGenre().compareTo(o2.getGenre());
        }
        if (result == 0) {
            result = o1.getTitle().compareToIgnoreCase(o2.getTitle());
        }
        if (result == 0) {
            result = o1.getBinding().ordinal();
        }
        return result;
    }
}
