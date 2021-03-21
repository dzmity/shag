package by.shag.lesson20.danilovich;


import java.util.Set;
import java.util.TreeSet;

import by.shag.lesson20.danilovich.enums.Binding;
import by.shag.lesson20.danilovich.enums.Genre;

public class Run {
    public static void main(String[] args) {

        Author one = new Author("Лев", "Толстой");
        Author two = new Author("Сергрей", "Есенин");
        Author three = new Author("Александр", "Пушкин");
        Illustrator illustrator = new Illustrator("Дима", "Данилович");
        Illustrator illustrator1 = new Illustrator("Кристина", "Данилович");
        Illustrator illustrator2 = new Illustrator("Артём", "Клюенков");

        Book book = new Book("Анна Каренина", Genre.SCIENCE, 1877,
                "Русский вестник", Binding.HARD);
        book.getAuthors().add(one);
        book.getIllustrators().add(illustrator);

        Book book1 = new Book("Анна Каренина", Genre.FANTASY, 1877,
                "Русский вестник", Binding.HARD);
        book1.getAuthors().add(one);

        Book book2 = new Book("Анна Каренина", Genre.ROMAN, 1877,
                "Русский вестник", Binding.HARD);
        book2.getAuthors().add(three);
        book2.getIllustrators().add(illustrator1);

        Book book3 = new Book("Анна Каренина", Genre.SCIENCE, 1877,
                "Русский вестник", Binding.HARD);
        book3.getAuthors().add(one);
        book3.getIllustrators().add(illustrator2);

        Book book01 = new Book("Анна Каренина", Genre.SCIENCE, 1877,
                "Русский вестник", Binding.HARD);
        book01.getAuthors().add(two);

        Set<Book> bong = new TreeSet<>(new BookComparator());
        bong.add(book);
        bong.add(book1);
        bong.add(book2);
        bong.add(book3);
        bong.add(book01);

        Set<Book> ice = new TreeSet<>(new AuthorBookComparator());
        ice.add(book);
        ice.add(book1);
        ice.add(book2);
        ice.add(book3);
        ice.add(book01);


        Set<Book> shelf = new TreeSet<>(new IllustratorComparator());
        shelf.add(book);
        shelf.add(book1);
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book01);

        System.out.println(bong);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(ice);
        System.out.println("_________________________________________________________________________________________");
        System.out.println(shelf);
    }
}
