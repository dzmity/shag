public class Book {

    private String name;
    private Genre genre;
    private String author;

    public Book(String name, String author, Genre genre){

        this.genre = genre;
        this.name = name;
        this.author = author;
    }
}
