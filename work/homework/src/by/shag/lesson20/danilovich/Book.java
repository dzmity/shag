package by.shag.lesson20.danilovich;



import java.util.*;

import by.shag.lesson20.danilovich.enums.Binding;
import by.shag.lesson20.danilovich.enums.Genre;

public class Book implements Comparable<Book> {

    private String title;
    private Genre genre;
    private int yearOfPublishing;
    private String publisherName;
    private Set<Author> authors = new TreeSet<>();
    private Set<Illustrator> illustrators = new TreeSet<>();
    private Binding binding;

    public Book() {
    }

    public Book(String title, Genre genre, int yearOfPublishing, String publisherName, Binding binding) {
        this.title = title;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.publisherName = publisherName;
        this.binding = binding;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Binding getBinding() {
        return binding;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Set<Illustrator> getIllustrators() {
        return illustrators;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", жанр: " + genre + ", год публикации: " + yearOfPublishing +
                ",\nиздательство: " + publisherName + ", переплет: " + binding + ",\nавтор: " + authors +
                ", илюстратор: " + illustrators + '\n' + "---   ---    ---  ---" + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        Book book = (Book) o;
        boolean result = true;

        String titles = book.title;
        if (titles == null) {
            result = this.title == null;
        } else {
            result = titles.equals(this.title);
        }

        String publisher = book.publisherName;
        if (publisher == null) {
            result = this.publisherName == null;
        } else {
            result = publisher.equals(this.publisherName);
        }
        if (this.yearOfPublishing != book.yearOfPublishing) {
            return false;
        }
        if (book.genre == null) {
            result = this.genre == null;
        } else {
            if (this.genre.ordinal() > book.genre.ordinal()) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (genre.hashCode());
        result = 31 * result + (yearOfPublishing);
        result = 31 * result + (publisherName == null ? 0 : publisherName.hashCode());
        result = 31 * result + (authors.hashCode());
        result = 31 * result + (illustrators.hashCode());
        result = 31 * result + (illustrators.hashCode());
        result = 31 * result + (binding.hashCode());
        return result;
    }

    @Override
    public int compareTo(Book book) {
        return 1;
    }
}
