package by.shag.lesson20.golatina;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("Alpher", "Ralph");
        Author author2 = new Author("Bethe", "BetheHans");
        Author author3 = new Author("Gamow", "GamowGeorge");

        Set<Author> authorSet = new TreeSet<>();

        Set<Author> authorSet2 = new TreeSet<>();
        authorSet2.add(author1);

        Set<Author> authorSet3 = new TreeSet<>();
        authorSet3.add(author3);

        Set<Author> authorSet4 = new TreeSet<>();
        authorSet4.add(author2);
        authorSet4.add(author3);

        Set<Author> authorSet5 = new TreeSet<>();
        authorSet5.add(author1);
        authorSet5.add(author2);
        authorSet5.add(author3);

        Illustrator illustrator1 = new Illustrator("AA", "Noname");
        Illustrator illustrator2 = new Illustrator("SS", "Noname");

        Set<Illustrator> illustratorSet = new TreeSet<>();
        illustratorSet.add(illustrator1);

        Set<Illustrator> illustratorSet2 = new TreeSet<>();
        illustratorSet2.add(illustrator2);

        Set<Illustrator> illustratorSet3 = new TreeSet<>();
        illustratorSet3.add(illustrator1);
        illustratorSet3.add(illustrator2);

        Book book1 = new Book("Books", Genre.DETECTIVE, 1981, "Q", author1, Binding.HARD);
        Book book11 = new Book("R2-D2", Genre.EPIC, 1002, "QQ", author1, Binding.SOFT);
        Book book12 = new Book("C-3PO", Genre.ROMAN, 2003, "QQQ", author1, Binding.OTHER);

        Book book2 = new Book("B2", Genre.DETECTIVE, 1981, "QB2", author1, Binding.SOFT);
        Book book3 = new Book("C3", Genre.NAUCHPOP, 1981, "Q", authorSet, Binding.HARD);
        Book book4 = new Book("D4", Genre.HORROR, 1981, "QE5", authorSet2, Binding.HARD);
        Book book5 = new Book("E5", Genre.LYRIC, 1987, "QE5", authorSet3, Binding.HARD);
        Book book6 = new Book("F6", Genre.FANTASY, 1987, "QF6", authorSet4, Binding.OTHER);
        Book book7 = new Book("G7", Genre.DRAMA, 1900, "QF6", authorSet5, Binding.OTHER);

        book4.setIllustratorSet(illustratorSet);
        book5.setIllustratorSet(illustratorSet2);
        book6.setIllustratorSet(illustratorSet3);

        Set<Book> bookSetYearPublisher = new TreeSet<>(new BookYearPublishingComparator());
        bookSetYearPublisher.add(book1);
        bookSetYearPublisher.add(book11);
        bookSetYearPublisher.add(book12);

        Set<Book> bookSetGenre = new TreeSet<>(new BookGenreComparator());
        bookSetGenre.add(book1);
        bookSetGenre.add(book11);
        bookSetGenre.add(book12);

        Set<Book> bookSetTitle = new TreeSet<>(new BookTitleComparator());
        bookSetTitle.add(book1);
        bookSetTitle.add(book11);
        bookSetTitle.add(book12);

        Set<Book> bookSetBinding = new TreeSet<>(new BookBindingComparator());
        bookSetBinding.add(book1);
        bookSetBinding.add(book11);
        bookSetBinding.add(book12);

        Set<Book> bookSetStandart = new TreeSet<>();
        bookSetStandart.add(book1);
        bookSetStandart.add(book2);
        bookSetStandart.add(book3);
        bookSetStandart.add(book4);
        bookSetStandart.add(book5);
        bookSetStandart.add(book6);
        bookSetStandart.add(book7);

        Set<Book> bookSetAuthorSurname = new TreeSet<>(new BookAuthorComparator());
        bookSetAuthorSurname.add(book1);
        bookSetAuthorSurname.add(book2);
        bookSetAuthorSurname.add(book3);
        bookSetAuthorSurname.add(book4);
        bookSetAuthorSurname.add(book5);
        bookSetAuthorSurname.add(book6);
        bookSetAuthorSurname.add(book7);

        Set<Book> bookSetIllustratorName = new TreeSet<>(new BookIllustratorComparator());
        bookSetIllustratorName.add(book1);
        bookSetIllustratorName.add(book2);
        bookSetIllustratorName.add(book3);
        bookSetIllustratorName.add(book4);
        bookSetIllustratorName.add(book5);
        bookSetIllustratorName.add(book6);
        bookSetIllustratorName.add(book7);

        System.out.println("Заданная по стандарту сортировка :" + bookSetStandart);

        System.out.println("\nСортировка по году издательства (меньший -> больший) :" + bookSetYearPublisher);
        System.out.println("\nСортировка по жанру (алфавитный) :" + bookSetGenre);
        System.out.println("\nСортировка по названию книги (алфавитный) :" + bookSetTitle);
        System.out.println("\nСортировка по типу переплета (твердый-> мягкий-> другой) :" + bookSetBinding);
        System.out.println("\nСортировка по фамилии автора (алфавитный) :" + bookSetAuthorSurname);
        System.out.println("\nСортировка по имени иллюстратора (null-> обратный алфавитный) :" + bookSetIllustratorName);

    }

}
