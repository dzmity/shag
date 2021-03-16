package by.shag.lesson20.Kletsko;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Nikolay", "Groznyi");
        Author author2 = new Author("Yan", "Ase");
        Author author3 = new Author("Kdldf", "Flfl");

        Set<Author> author = new TreeSet<>();
        author.add(author1);

        Set<Author> author21 = new TreeSet<>();
        author21.add(author2);

        Set<Author> author31 = new TreeSet<>();
        author31.add(author3);

        Set<Author> authorSet4 = new TreeSet<>();
        authorSet4.add(author2);

        Set<Author> authorSet5 = new TreeSet<>();
        authorSet5.add(author2);
        authorSet5.add(author3);

        Book book1 = new Book("Who?", GenreEnum.DETECTIVE, 1999, "Ekdkl", author, BidingType.SOFT);
        Book book11 = new Book("Died", GenreEnum.HORROR, 1956, "Flf", author21, BidingType.ANOTHER);
        Book book12 = new Book("Love", GenreEnum.NOVEL, 1998, ":Opdl", author31, BidingType.SOLID);

        Set<Book> book = new TreeSet<>();
        book.add(book1);
        book.add(book11);
        book.add(book12);

        System.out.println(book);
    }

}
