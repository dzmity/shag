package by.shag.lesson20.Kletsko;

import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book>{

    private String name;
    private GenreEnum genre;
    private int year;
    private String namePublish;
    private Set<Author> author = new TreeSet<>();
    private Set<Illustrator> illustrator = null;
    private BidingType bindType;

    public Book(String name, GenreEnum genre, int year, String namePublish, Set<Author> author, BidingType bindType) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.namePublish = namePublish;
        this.author = author;
        this.bindType = bindType;
    }

    @Override
    public int compareTo(Book o) {
        if (o == null) {
            return 0;
        }
        if (o.name.compareTo(this.name) == 0) {
            if (o.namePublish.compareTo(this.namePublish) == 0) {
                if (o.year == this.year) {
                    if (o.genre == this.genre) {
                        return 0;
                    }
                    return this.genre.ordinal() - o.genre.ordinal();
                }
                return o.year - this.year;
            }
            return this.namePublish.compareTo(o.namePublish);
        }
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    public void setGenre(GenreEnum genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNamePublish() {
        return namePublish;
    }

    public void setNamePublish(String namePublish) {
        this.namePublish = namePublish;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public Set<Illustrator> getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(Set<Illustrator> illustrator) {
        this.illustrator = illustrator;
    }

    public BidingType getBindType() {
        return bindType;
    }

    public void setBindType(BidingType bindType) {
        this.bindType = bindType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", year=" + year +
                ", namePublish='" + namePublish + '\'' +
                ", author=" + author +
                ", illustrator=" + illustrator +
                ", bindType=" + bindType +
                '}';
    }
}
