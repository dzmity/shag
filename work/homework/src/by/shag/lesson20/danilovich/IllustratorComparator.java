package by.shag.lesson20.danilovich;

import java.util.Comparator;

public class IllustratorComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int result = 0;
        if (o1.getIllustrators().iterator().hasNext()) {
            result = -1;
            if (o2.getIllustrators().iterator().hasNext()) {
                Illustrator a1 = (Illustrator) o1.getIllustrators().toArray()[0];
                Illustrator a2 = (Illustrator) o2.getIllustrators().toArray()[0];
                result = a1.getLastname().compareToIgnoreCase(a2.getLastname());
                if (result == 0) {
                    result = a1.getName().compareTo(a2.getName());
                }
            }
        } else {
            result = 1;
        }
        return -1 * result;
    }
}
