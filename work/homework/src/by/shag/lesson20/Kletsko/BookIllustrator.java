package by.shag.lesson20.Kletsko;

import java.util.Comparator;

public class BookIllustrator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getIllustrator() == null) {
            if (o2.getIllustrator() == null) {
                return 0;
            }
            return 0;
        }

        for (Illustrator illustrator1 : o1.getIllustrator()) {
            for (Illustrator illustrator2 : o2.getIllustrator()) {
                if (illustrator1 != illustrator2) {
                    return illustrator1.compareTo(illustrator2);
                }
            }
        }
        return 0;
    }
}
