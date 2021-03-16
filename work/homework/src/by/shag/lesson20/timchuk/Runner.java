package by.shag.lesson20.timchuk;

import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        Set<Author> authors1 = new TreeSet<>();
        Author gogol = new Author("Nikolai", "Gogol");
        Author semendyaev = new Author("Konstantin", "Semendyaev");
        authors1.add(semendyaev);
        authors1.add(gogol);
        System.out.println(authors1);

        Set<Author> authors2 = new TreeSet<>();
        authors2.add(gogol);
        System.out.println(authors2);

        Set<Illustrator> illustrators1 = new TreeSet<>();
        Illustrator serov = new Illustrator("Alexandr", "Serov");
        Illustrator ivanov = new Illustrator("Ivan", "Ivanov");
        illustrators1.add(serov);
        illustrators1.add(ivanov);
        System.out.println(illustrators1);
        Set<Illustrator> illustrators2 = new TreeSet<>();
        illustrators2.add(serov);
        System.out.println(illustrators2);
        System.out.println();

        //Set<Book> books = new TreeSet<>(new BookYearPublishingComparator());
        //Set<Book> books = new TreeSet<>(new BookGenreComparator());
        //Set<Book> books = new TreeSet<>(new BookNameComparator());
        //Set<Book> books = new TreeSet<>(new BookBindingComparator());
        //Set<Book> books = new TreeSet<>(new BookAuthorComparator());
        Set<Book> books = new TreeSet<>(new BookIllustratorComparator());

        Book book1 = new Book("Vij", Genre.FICTION, 1918, "Amalfeya",
                authors1, illustrators1, Binding.SOFT);
        Book book2 = new Book("Mat", Genre.FANTASY, 1920, "Progress",
                authors2, illustrators2, Binding.OTHER);
        Book book3 = new Book("Spravochnik", Genre.TEXTBOOK, 1995, "Nauka",
                authors2, Binding.SOLID);


        books.add(book1);
        books.add(book2);
        books.add(book3);
        System.out.println(books);
    }


}

