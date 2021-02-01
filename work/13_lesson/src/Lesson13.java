import lesson13.Book;
import lesson13.Genre;

public class Lesson13 {

    public static void main(String[] args) {

        // foodStuff.setFoodName("");
        // foodStuff.setFoodName(new String(""));
        String s1 = "";
        String s2 = new String("").intern();
        System.out.println(s1 == s2);
//        Book book = new Book();
//        book.setAuthor("Pushkin");
//        book.setName("Zolotaya rubka");
//        book.setGenre(Genre.SCIENCE);

        System.out.println(s1 == s2);
//        final Book book2 = new Book();
//        book.setAuthor("Pushkin");
//        book.setName("Zolotaya rubka2   ");
//        book.setGenre(Genre.SCIENCE);

//        book2 = new Book();
//        book2.setName("Anton");
//        book2.setAuthor("Dima");

        final int[] mass = {1, 2, 3};
//        mass = new int[] {3, 2, 1};
        mass[0] = 3;

        Book bookWithManyAuthors = new Book("Math 8",
                new String[] {"Pushkin", "Marks"}, Genre.SCIENCE);
        System.out.println(bookWithManyAuthors);
        String[] reference = bookWithManyAuthors.getAuthors();
        reference[0] = "Gogol";
        System.out.println(bookWithManyAuthors);

        Genre genre = Genre.SCIENCE;
        Genre genre2 = Genre.SCIENCE;
        System.out.println(genre == genre2);
        makeDecisionByGenre(genre);
        Genre[] values = Genre.values();
        for (Genre g : values) {
            System.out.println(g);
        }
        Genre genre4 = Genre.valueOf("CLASSIC");
//        System.out.println(genre4 == Genre.CLASSIC);
//        Genre genre5 = Genre.valueOf("CLASSIc");
        Genre genre6 = Genre.FANTASY;
        System.out.println(genre.getDescription());
        System.out.println(genre.getOrder());
        System.out.println(genre6.name());
        System.out.println(genre6.ordinal());
    }

    private static void makeDecisionByGenre(Genre genre) {
        switch (genre) {
            case SCIENCE:
                System.out.println("123");
                break;
            case CLASSIC:
                System.out.println("321");
                break;
            default:
                System.out.println("----");
        }
    }
}
