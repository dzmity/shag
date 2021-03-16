package by.shag.lesson20.manakov;

import java.util.Set;
import java.util.TreeSet;


public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("Sasha", "Pushkin");
        Author author2 = new Author("Sergei", "Esenin");
        Author author3 = new Author("Anna", "Ahmatova");

        Set<Book> books = new TreeSet<>();
        Book book1 = new Book("AngreeMen", Genre.COMEDY, 1951, "1C", author1, "Solid");
        Book book2 = new Book("MonsterDoll", Genre.HORROR, 1952, "BooksOfFortune", author2, "Soft");
        Book book3 = new Book("FunnyMonkey", Genre.COMEDY, 1960, "AuthorDaun", author3, "Other");
        Book book4 = new Book("ManInBlack", Genre.DETECTIVE, 2001, "WorldFamous", author1, "Solid");


        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(books);






    }
}
