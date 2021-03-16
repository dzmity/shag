package by.shag.lesson20.golatina;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {

    private String title;

    private Genre genre;

    private int yearPublishing;

    private String publisher;

    private Set<Author> authorSet = new TreeSet<>();

    private Author author;

    private Set<Illustrator> illustratorSet = null;

    private Binding binding;

    public Book(String title, Genre genre, int yearPublishing, String publisher, Author author, Binding binding) {
        this.title = title == null ? "undefined" : title;
        this.genre = genre == null ? Genre.BOOK : genre;
        this.yearPublishing = yearPublishing;
        this.publisher = publisher == null ? "undefined" : publisher;
        this.author = author == null ? new Author("undefined", "unnamed") : author;
        this.binding = binding == null ? Binding.OTHER : binding;
    }

    public Book(String title, Genre genre, int yearPublishing, String publisher, Set<Author> authorSet, Binding binding) {
        this.title = title == null ? "undefined" : title;
        this.genre = genre == null ? Genre.BOOK : genre;
        this.yearPublishing = yearPublishing;
        this.publisher = publisher == null ? "undefined" : publisher;
        if (authorSet == null) {
            this.authorSet = new TreeSet<>();
            this.authorSet.add(new Author("undefined", "unnamed"));
        } else {
            this.authorSet = authorSet;
        }
        this.binding = binding == null ? Binding.OTHER : binding;
    }

    @Override
    public int compareTo(Book book) {
        if (book == null) {
            return 0;
        }
        if (book.title.compareToIgnoreCase(this.title) == 0) {
            if (book.publisher.compareToIgnoreCase(publisher) == 0) {
                if (book.yearPublishing == yearPublishing) {
                    if (book.genre == genre) {
                        return 0;
                    }
                    return genre.ordinal() - book.genre.ordinal();
                }
                return book.yearPublishing - yearPublishing;
            }
            return publisher.compareToIgnoreCase(book.publisher);
        }
        return title.compareToIgnoreCase(book.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && title.equals(book.title) && genre == book.genre
                && publisher.equals(book.publisher) && authorSet.equals(book.authorSet) && author.equals(book.author)
                && illustratorSet.equals(book.illustratorSet) && binding == book.binding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, yearPublishing, publisher, authorSet, author, illustratorSet, binding);
    }

    @Override
    public String toString() {
        if (author != null) {
            return "\nBook{" +
                    "title='" + title + '\'' +
                    ", genre=" + genre +
                    ", yearPublishing=" + yearPublishing +
                    ", publisher='" + publisher + '\'' +
                    ", author =" + author +
                    ", illustratorSet=" + illustratorSet +
                    ", binding=" + binding +
                    '}';
        }
        return "\nBook{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                ", yearPublishing=" + yearPublishing +
                ", publisher='" + publisher + '\'' +
                ", authorList=" + authorSet +
                ", illustratorSet=" + illustratorSet +
                ", binding=" + binding +
                '}';
    }

    public void setIllustratorSet(Set<Illustrator> illustratorSet) {
        this.illustratorSet = illustratorSet;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public String getPublisher() {
        return publisher;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public Set<Illustrator> getIllustratorSet() {
        return illustratorSet;
    }

    public Binding getBinding() {
        return binding;

    }
}
