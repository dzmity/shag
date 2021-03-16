package by.shag.lesson20.golatina;

import java.util.Objects;

public class Author implements Comparable<Author> {

    private String surname;

    private String name;

    public Author(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return name.equalsIgnoreCase(author.name) && surname.equalsIgnoreCase(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname.toLowerCase(), name.toLowerCase());
    }

    @Override
    public int compareTo(Author author) {
        if (author == null) {
            return 0;
        }
        if (this.surname.compareToIgnoreCase(author.surname) == 0) {
            return this.name.compareToIgnoreCase(author.name);
        }
        return this.surname.compareToIgnoreCase(author.surname);
    }

}
