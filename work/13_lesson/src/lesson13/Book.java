package lesson13;

import java.util.Arrays;

public class Book {

    private final String name;
    private final String[] authors;
    private Genre genre;

    public Book(String name, String[] authors, Genre genre) {
        this.name = name;
        this.authors = authors;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String[] getAuthors() {
        return authors;
    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

    public Genre getGenre() {
        return genre;
    }

//    public void setGenre(String genre) {
//        this.genre = genre;
//    }




    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", genre='" + genre + '\'' +
                '}';
    }
}
