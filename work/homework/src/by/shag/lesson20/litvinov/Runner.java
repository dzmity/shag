package by.shag.lesson20.litvinov;

import by.shag.lesson20.litvinov.comparators.*;
import by.shag.lesson20.litvinov.enams.GenreOfTheBook;
import by.shag.lesson20.litvinov.exceptions.RequiredFieldsException;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "СПИСОК КНИГ" + "-----------------------------------------------------------------------------------");

        List<Book> books = new ArrayList();

        TreeSet<Author> listOfAuthors1 = new TreeSet<>();
        Author author11 = new Author("Александр", "Грибоедов");
        listOfAuthors1.add(author11);

        try {
            Book book1 = new Book("Горе от ума", GenreOfTheBook.CLASSIC, 2010,
                    "Русский дом", "Другой", listOfAuthors1, null);
            books.add(book1);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 1. " + e.getMessage());
        }

        TreeSet<Author> listOfAuthors2 = new TreeSet<>();
        Author author21 = new Author("Алексей", "Толстой");
        Author author22 = new Author("Карло", "Коллоди");
        listOfAuthors2.add(author21);
        listOfAuthors2.add(author22);

        TreeSet<Illustrator> listOfIllustrators2 = new TreeSet<>();
        Illustrator illustrator21 = new Illustrator("Елена", "Данько");
        Illustrator illustrator22 = new Illustrator("Леонид", "Владимирский");
        listOfIllustrators2.add(illustrator21);
        listOfIllustrators2.add(illustrator22);

        try {
            Book book2 = new Book("Приключения Буратино", GenreOfTheBook.FAIRY_TALES, 2012,
                    "Россмен-Пресс", "Твердый", listOfAuthors2,
                    listOfIllustrators2);
            books.add(book2);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 2. " + e.getMessage());
        }

// Проверка. На все обязательные поля.
        try {
            Book book3 = new Book(null, GenreOfTheBook.DETECTIVE_STORIES, 0,
                    null, "Мягкий", null, null);
            books.add(book3);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 3. " + e.getMessage());
        }

        TreeSet<Author> listOfAuthors4 = new TreeSet<>();
        Author author41 = new Author("Джордж", "Оруэлл");
        listOfAuthors4.add(author41);

        TreeSet<Illustrator> listOfIllustrators4 = new TreeSet<>();
        Illustrator illustrator41 = new Illustrator("Иван", "Петров");
        listOfIllustrators4.add(illustrator41);

        try {
            Book book4 = new Book("1984", GenreOfTheBook.SCIENCE_FICTION, 2019,
                    "ACT", "Мягкий", listOfAuthors4, listOfIllustrators4);
            books.add(book4);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 4. " + e.getMessage());
        }

        TreeSet<Author> listOfAuthors5 = new TreeSet<>();
        Author author51 = new Author("УильямСомерсет", "Моэм");
        listOfAuthors5.add(author51);

        try {
            Book book5 = new Book("Бремя страстей человеческих", GenreOfTheBook.AUTOBIOGRAPHICAL_NOVEL,
                    2013,
                    "Русский дом", "Твердый", listOfAuthors5, null);
            books.add(book5);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 5. " + e.getMessage());
        }

        try {
            Book book6 = new Book("Бремя страстей человеческих", GenreOfTheBook.AUTOBIOGRAPHICAL_NOVEL,
                    2010,
                    "Русский дом", "Твердый", listOfAuthors5, null);
            books.add(book6);
        } catch (RequiredFieldsException e) {
            System.err.println("Книга 6. " + e.getMessage());
        }
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный Comparable   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books);
        books.forEach(System.out::println);

        Comparator<Book> yearOfPublicationComparator = new YearOfPublicationComparator();
        Comparator<Book> genreOfTheBookComparator = new GenreOfTheBookComparator();
        Comparator<Book> titleOfBookAlphabeticalComparator = new TitleOfBookAlphabeticalComparator();
        Comparator<Book> bindingTypeComparator = new BindingTypeComparator();
        Comparator<Book> lastNameOfAuthorAlphabeticalComparator = new LastNameOfAuthorAlphabeticalComparator();
        Comparator<Book> nameOfIllustratorReverseAlphabeticalComparator =
                new NameOfIllustratorReverseAlphabeticalComparator();

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по году издания от меньшего к большему   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, yearOfPublicationComparator);
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по жанру в алфавитном порядке   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, genreOfTheBookComparator);
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по названию книги в алфавитном порядке   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, titleOfBookAlphabeticalComparator);
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по типу переплета   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, bindingTypeComparator);
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по фамилии автора в алфавитном порядке   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, lastNameOfAuthorAlphabeticalComparator);
        books.forEach(System.out::println);

        System.out.println("\n--------------------------------------------------------------------------------------" +
                "Список книг, отсортированный по имени иллюстратора в обраном алфавитном порядке   " +
                "---------------------------------------------------------------------------------------------------");
        Collections.sort(books, nameOfIllustratorReverseAlphabeticalComparator);
        books.forEach(System.out::println);
    }
}