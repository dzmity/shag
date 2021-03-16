package by.shag.lesson20.shustova;

import by.shag.lesson20.shustova.Comparator.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("Берт", "Бейтс");
        Author author2 = new Author("Кэтти", "Сьерра");
        Author author3 = new Author("Роджер", "Желязны");
        Author author4 = new Author("Марк", "Твен");
        Author author5 = new Author("Братья", "Гримм");
        Author author6 = new Author("Английский", "Народ");
        Author author7 = new Author("Джанни", "Родари");

        Illustrator illustrator1 = new Illustrator("Майкл","Лукидис");
        Illustrator illustrator2 = new Illustrator("Эдди","Фридман");
        Illustrator illustrator3 = new Illustrator("Зоя","Главная");
        Illustrator illustrator4 = new Illustrator("Баба","Яга");

        //Set<Book> books = new TreeSet<>();
        //Set<Book> books = new TreeSet<>(new BookYearOfPublishing());
        //Set<Book> books = new TreeSet<>(new BookGenreComparator());
        //Set<Book> books = new TreeSet<>(new BookNameComparator());
        //Set<Book> books = new TreeSet<>(new BookBindingTypeComparator());
        //Set<Book> books = new TreeSet<>(new BookAuthorNameComparator());
       Set<Book> books = new TreeSet<>(new BookIllustratorNameComparator());
        Book book1 = new Book("Изучаем JAVA", Genre.SCIENCE,
                2012, "ЭКСМО", BindingType.SOFTCOVER);
        book1.setAuthorList(author1);
        book1.setAuthorList(author2);
        book1.setIllustratorList(illustrator1);
        book1.setIllustratorList(illustrator2);
        book1.setIllustratorList(illustrator4);
        book1.setIllustratorList(illustrator3);

        Book book2 = new Book("Амбера Хроники", Genre.FANTASY,
                2000, "ЭКСМО", BindingType.HARDCOVER);
        book2.setAuthorList(author3);
        book2.setIllustratorList(illustrator2);

        Book book3 = new Book("Ружья Авалона", Genre.FANTASY,
                2000, "ЭКСМО", BindingType.HARDCOVER);
        book3.setAuthorList(author3);
        book3.setIllustratorList(illustrator3);

        Book book4 = new Book("Ружья Авалона", Genre.FANTASY,
                2020, "ЭКСМО", BindingType.ANOTHER);
        book4.setAuthorList(author3);

        Book book5 = new Book("Приключения Тома Сойера", Genre.ADVENTURE,
                1980, "Детский мир", BindingType.SOFTCOVER);
        book5.setAuthorList(author4);

        Book book6 = new Book("Сказки", Genre.BIOGRAPHY,
                1970, "Детский мир", BindingType.HARDCOVER);
        book6.setAuthorList(author5);
        book6.setAuthorList(author6);
        book6.setAuthorList(author7);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println(books);
    }
}
