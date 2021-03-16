package by.shag.lesson20.litvinov;

import by.shag.lesson20.litvinov.enams.GenreOfTheBook;
import by.shag.lesson20.litvinov.exceptions.RequiredFieldsException;

import java.util.TreeSet;

public class Book implements Comparable<Book> {

    private String title;
    private GenreOfTheBook genreOfTheBook;
    private Integer yearOfPublication;
    private String nameOfThePublishingHouse;
    private String bookBindingType;
    private TreeSet<Author> listOfAuthors;
    private TreeSet<Illustrator> listIllustrators;

    public Book(String title, GenreOfTheBook genreOfTheBook, Integer yearOfPublication,
                String nameOfThePublishingHouse, String bookBindingType, TreeSet<Author> listOfAuthors,
                TreeSet<Illustrator> listIllustrators)

            throws RequiredFieldsException {
        if (title == null || genreOfTheBook == null || yearOfPublication == 0 || nameOfThePublishingHouse == null ||
                bookBindingType == null || listOfAuthors == null) {
            throw new RequiredFieldsException("Ошибка! Заполните все обязательные поля!");
        }

        this.title = title;
        this.genreOfTheBook = genreOfTheBook;
        this.yearOfPublication = yearOfPublication;
        this.nameOfThePublishingHouse = nameOfThePublishingHouse;
        this.bookBindingType = bookBindingType;
        this.listOfAuthors = listOfAuthors;
        this.listIllustrators = listIllustrators;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null) {
            this.title = title;
        }
    }

    public GenreOfTheBook getGenreOfTheBook() {
        return genreOfTheBook;
    }

    public void setGenreOfTheBook(GenreOfTheBook genreOfTheBook) {
        if (genreOfTheBook != null) {
            this.genreOfTheBook = genreOfTheBook;
        }
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        if (yearOfPublication != 0) {
            this.yearOfPublication = yearOfPublication;
        }
    }

    public String getNameOfThePublishingHouse() {
        return nameOfThePublishingHouse;
    }

    public void setNameOfThePublishingHouse(String nameOfThePublishingHouse) {
        if (nameOfThePublishingHouse != null) {
            this.nameOfThePublishingHouse = nameOfThePublishingHouse;
        }
    }

    public String getBookBindingType() {
        return bookBindingType;
    }

    public void setBookBindingType(String bookBindingType) {
        if (bookBindingType != null) {
            this.bookBindingType = bookBindingType;
        }
    }

    public TreeSet<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public void setListOfAuthors(TreeSet<Author> listOfAuthors) {
        if (listOfAuthors != null) {
            this.listOfAuthors = listOfAuthors;
        }
    }

    public TreeSet<Illustrator> getListIllustrator() {
        return listIllustrators;
    }

    public void setListIllustrator(TreeSet<Illustrator> listIllustrator) {
        this.listIllustrators = listIllustrator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        if (!(super.equals(obj))) {
            return false;
        }

        Book book = (Book) obj;
        return this.title != null && book.title != null && this.title.equals(book.title)

                && this.genreOfTheBook != null && book.genreOfTheBook != null &&
                this.genreOfTheBook.equals(book.genreOfTheBook)

                && this.yearOfPublication.equals(book.yearOfPublication)

                && this.nameOfThePublishingHouse != null && book.nameOfThePublishingHouse != null &&
                this.nameOfThePublishingHouse.equals(book.nameOfThePublishingHouse)

                && this.bookBindingType != null && book.bookBindingType != null &&
                this.bookBindingType.equals(book.bookBindingType)

                && this.listOfAuthors != null && book.listOfAuthors != null &&
                this.listOfAuthors.equals(book.listOfAuthors)

                && this.listIllustrators != null && book.listIllustrators != null &&
                this.listIllustrators.equals(book.listIllustrators);
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (title == null ? 0 : title.hashCode());
        hashCode = 31 * hashCode + (genreOfTheBook == null ? 0 : genreOfTheBook.hashCode());
        hashCode = 31 * hashCode + (int) yearOfPublication;
        hashCode = 31 * hashCode + (nameOfThePublishingHouse == null ? 0 : nameOfThePublishingHouse.hashCode());
        hashCode = 31 * hashCode + (bookBindingType == null ? 0 : bookBindingType.hashCode());
        hashCode = 31 * hashCode + (listOfAuthors == null ? 0 : listOfAuthors.hashCode());
        hashCode = 31 * hashCode + (listIllustrators == null ? 0 : listIllustrators.hashCode());
        return hashCode();
    }

    @Override
    public int compareTo(Book book) {
        if (title == null) {
            return 0;
        }
        int value = title.compareTo(book.title);
        if (value == 0) {
            value = nameOfThePublishingHouse.compareTo(book.nameOfThePublishingHouse);
        }
        if (value == 0) {
            value = (int) book.yearOfPublication - yearOfPublication;
        }
        if (value == 0) {
            value = genreOfTheBook.ordinal() - book.genreOfTheBook.ordinal();
        }
        return value;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", genreOfTheBook=" + genreOfTheBook +
                ", yearOfPublication=" + yearOfPublication +
                ", nameOfThePublishingHouse='" + nameOfThePublishingHouse + '\'' +
                ", bookBindingType='" + bookBindingType + '\'' +
                ", listOfAuthors=" + listOfAuthors +
                ", listIllustrator=" + listIllustrators +
                '}';
    }
}
