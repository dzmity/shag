package by.shag.lesson21;

import java.util.Comparator;

public class Author {

    public String name;

    public String lastName;


    public static class NameComparator implements Comparator<Author>  {

        @Override
        public int compare(Author author, Author t1) {
            return author.lastName.compareTo(t1.lastName);
        }
    }
}
