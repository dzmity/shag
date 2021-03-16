package by.shag.lesson20.Gritskevich;

import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {

        Author author1 = new Author("Igor", "APedik");
        Author author2 = new Author("Vasya", "BPypkin");
        Author author3 = new Author("Nik", "ASoset");
        Author author4 = new Author("Olesya", "CDaet");
        Illustrator illustrator1 = new Illustrator("Agor", "Tytkon");
        Illustrator illustrator2 = new Illustrator("gor", "Tytkon");
        Illustrator illustrator3 = new Illustrator("Agor", "Tytkon");
        Illustrator illustrator4 = new Illustrator("gor", "Tytkon");

        Book book1 = new Book("Book1", GenreOfBook.DETECTIVE, LocalDate.of(2020, 5, 10),
                "PublicHouse", BindingType.SOLID);
        Book book2 = new Book("Book1", GenreOfBook.DETECTIVE, LocalDate.of(2020, 5, 10),
                "PublicHouse", BindingType.SOLID);

        book1.getAuthorSet().add(author1);
        book1.getAuthorSet().add(author2);

        book2.getAuthorSet().add(author3);
        book2.getAuthorSet().add(author4);

        Set<Illustrator> illustratorSet1 = new TreeSet<>();
        Set<Illustrator> illustratorSet2 = new TreeSet<>();

        illustratorSet1.add(illustrator1);
        illustratorSet1.add(illustrator2);

        illustratorSet2.add(illustrator3);
        illustratorSet2.add(illustrator4);

        book1.setIllustrator(illustratorSet1);
        book2.setIllustrator(illustratorSet2);

        Set<Book> bookSet = new TreeSet<>(new BookComparatorDateOfPublishing().thenComparing(new BookComparatorGenre()
                .thenComparing(new BookComparatorName().thenComparing(new BookComparatorBindingType())))
                .thenComparing(new BookComparatorAuthorLastName()).thenComparing(new BookComparatorIllustratorName()));

        bookSet.add(book1);
        bookSet.add(book2);
        System.out.println(bookSet);

    }
}
