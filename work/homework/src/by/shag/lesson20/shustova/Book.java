package by.shag.lesson20.shustova;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book> {

    private final String name;
    private final Genre genre;
    private final int yearOfPublishing;
    private final String publisherName;
    private final Set<Author> authorList = new TreeSet<>();
    private final Set<Illustrator> illustratorList = new TreeSet<>();
    private final BindingType bindingType;

    public Book(String name, Genre genre, int yearOfPublishing, String publisherName, BindingType bindingType) {
        this.name = name;
        this.genre = genre;
        this.yearOfPublishing = yearOfPublishing;
        this.publisherName = publisherName;
        this.bindingType = bindingType;
    }

    public Iterator<Author> getIteratorAuthorList() {
        return authorList.iterator();
    }

    public Iterator<Illustrator> getIteratorIllustratorList() {
        return illustratorList.iterator();
    }

    public void setAuthorList(Author authorList) {
        if (authorList != null) {
            this.authorList.add(authorList);
        }
    }

    public void setIllustratorList(Illustrator illustratorList) {
        if (illustratorList != null) {
            this.illustratorList.add(illustratorList);
        }
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public Genre getGenre() {
        return genre;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return "\n-----Книга{" +
                "Название='" + name + '\'' +
                ", Жанр=" + genre +
                ", Год издания=" + yearOfPublishing +
                ", Издатель='" + publisherName + '\'' +
                ", Переплет=" + bindingType +
                ", \nСписок авторов=" + authorList +
                ", \nСписок иллюстраторов=" + illustratorList +
                "}";
    }

    @Override
    public boolean equals(Object bookAnother) {
        if (bookAnother == null) {
            return false;
        }
        if (!(bookAnother instanceof Book)) {
            return false;
        }
        if (this == bookAnother) {
            return true;
        }
        Book book = (Book) bookAnother;
        return (name == null) ? book.name == null : name.equals(book.name)
                && genre == book.genre
                && yearOfPublishing == book.yearOfPublishing
                && bindingType == book.bindingType
                && (publisherName == null) ?
                book.publisherName == null :
                publisherName.equals(book.publisherName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 17;

        hashCode = prime * hashCode + ((name == null) ? 0 : name.hashCode());
        hashCode = prime * hashCode + genre.hashCode();
        hashCode = prime * hashCode + yearOfPublishing;
        hashCode = prime * hashCode + ((publisherName == null) ? 0 : publisherName.hashCode());
        hashCode = prime * hashCode + bindingType.hashCode();
        return hashCode;
    }

    @Override
    public int compareTo(Book book) {
        if (this.name == null) {
            return 0;
        }
        int result = this.name.compareTo(book.name);
        if (result == 0) {
            if (this.publisherName == null) {
                return 0;
            } else {
                result = this.publisherName.compareTo(book.publisherName);
            }
        }
        if (result == 0) {
            result = -1 * (this.yearOfPublishing - book.yearOfPublishing);  //порядок max..min
        }
        if (result == 0) {
            result = (this.genre.ordinal() - book.genre.ordinal()); //порядок min..max
        }
        return result;
    }
}
