package by.shag.lesson20.Gritskevich;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {

    private String name;
    private GenreOfBook genreOfBook;
    private LocalDate dateOfPublishing;
    private String publishingHouseName;
    private BindingType bindingType;
    private Set<Illustrator> illustrator;
    private Set<Author> authorSet;

    public Book(String name, GenreOfBook genreOfBook, LocalDate dateOfPublishing, String publishingHouseName, BindingType bindingType) {
        this.name = name;
        this.genreOfBook = genreOfBook;
        this.dateOfPublishing = dateOfPublishing;
        this.publishingHouseName = publishingHouseName;
        this.bindingType = bindingType;
        this.authorSet = new TreeSet<>();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genreOfBook=" + genreOfBook +
                ", dateOfPublishing=" + dateOfPublishing +
                ", publishingHouseName='" + publishingHouseName + '\'' +
                ", bindingType=" + bindingType +
                ", illustrator=" + illustrator +
                ", authorSet=" + authorSet +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public GenreOfBook getGenreOfBook() {
        return genreOfBook;
    }


    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public Set<Author> getAuthorSet() {
        return authorSet;
    }

    public Set<Illustrator> getIllustratorSet() {
        return illustrator;
    }

    public void setIllustrator(Set<Illustrator> illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(this.name, book.name)
                && Objects.equals(this.genreOfBook, book.genreOfBook)
                && Objects.equals(dateOfPublishing, book.dateOfPublishing)
                && Objects.equals(this.publishingHouseName, book.publishingHouseName)
                && Objects.equals(this.authorSet, book.authorSet)
                && Objects.equals(this.illustrator, book.illustrator)
                && Objects.equals(this.bindingType, book.bindingType);

    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + name.hashCode();
        hashCode = 31 * hashCode + genreOfBook.hashCode();
        hashCode = 31 * hashCode + dateOfPublishing.hashCode();
        hashCode = 31 * hashCode + publishingHouseName.hashCode();
        hashCode = 31 * hashCode + authorSet.hashCode();
        hashCode = 31 * hashCode + illustrator.hashCode();
        hashCode = 31 * hashCode + bindingType.hashCode();
        return hashCode;
    }

    @Override
    public int compareTo(Book book) {
        int result = this.name.compareTo(book.getName());
        if (result == 0) {
            result = this.publishingHouseName.compareTo(book.getPublishingHouseName());
        }
        if (result == 0) {
            result = this.dateOfPublishing.equals(book.getDateOfPublishing()) ? 0 :
                    this.dateOfPublishing.isBefore(book.getDateOfPublishing()) ? -1 : 1;
        }
        if (result == 0) {
            result = this.genreOfBook.compareTo(book.genreOfBook);
        }
        return result;
    }
}
