package by.shag.lesson20.timchuk;

import java.util.Objects;
import java.util.Set;

public class Book implements Comparable<Book> {

    private String bookName;
    private Genre genre;
    private int yearPublishing;
    private String publisherName;
    private Set<Author> authors;
    private Set<Illustrator> illustrators;
    private Binding binding;

    public Book(String bookName, Genre genre, int yearPublishing, String publisherName, Set<Author> authors, Set<Illustrator> illustrators, Binding binding) {
        this.bookName = bookName;
        this.genre = genre;
        this.yearPublishing = yearPublishing;
        this.publisherName = publisherName;
        this.authors = authors;
        this.illustrators = illustrators;
        this.binding = binding;
    }

    public Book(String bookName, Genre genre, int yearPublishing, String publisherName, Set<Author> authors, Binding binding) {
        this.bookName = bookName;
        this.genre = genre;
        this.yearPublishing = yearPublishing;
        this.publisherName = publisherName;
        this.authors = authors;
        this.binding = binding;
    }

    public String getBookName() {
        return bookName;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }


    public String getPublisherName() {
        return publisherName;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public Set<Illustrator> getIllustrators() {
        return illustrators;
    }

    public Binding getBinding() {
        return binding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        boolean var = false;
        var = (this.bookName == null ? book.bookName == null : this.bookName.equals(book.bookName))
                && (this.genre == null ? book.genre == null : this.genre.equals(book.genre))
                && this.yearPublishing == book.yearPublishing
                && (this.publisherName == null ? book.publisherName == null : this.publisherName.equals(book.publisherName))
                && (this.authors.equals(book.authors))
                && (this.illustrators == null ? book.illustrators == null : this.illustrators.equals(book.illustrators))
                && (this.binding == null ? book.binding == null : this.binding.equals(book.binding));
        return var;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (bookName == null ? 0 : bookName.hashCode());
        hashCode = 31 * hashCode + (genre == null ? 0 : genre.hashCode());
        hashCode = 31 * hashCode + yearPublishing;
        hashCode = 31 * hashCode + publisherName == null ? 0 : publisherName.hashCode();
        hashCode = 31 * hashCode + (authors == null ? 0 : authors.hashCode());
        hashCode = 31 * hashCode + (illustrators == null ? 0 : illustrators.hashCode());
        hashCode = 31 * hashCode + (binding == null ? 0 : binding.hashCode());
        return hashCode;
    }

    @Override
    public int compareTo(Book book) {
        if (bookName == null) {
            return 0;
        }
        int result = bookName.compareTo(book.bookName);
        if (result == 0) {
            if (publisherName == null) {
                return 0;
            }
            result = publisherName.compareTo(book.publisherName);
        }

        if (result == 0) {
            result = book.yearPublishing - this.yearPublishing;
        }
        if (result == 0) {
            result = genre.ordinal() - book.genre.ordinal();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", genre=" + genre +
                ", yearPublishing=" + yearPublishing +
                ", publisherName='" + publisherName + '\'' +
                ", authors=" + authors +
                ", illustrators=" + illustrators +
                ", binding=" + binding +
                '}' + '\n';
    }


}
