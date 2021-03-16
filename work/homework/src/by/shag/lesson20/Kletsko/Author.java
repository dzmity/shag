package by.shag.lesson20.Kletsko;

public class Author implements Comparable<Author> {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int compareTo(Author author22) {
        if (author22 == null) {
            return 0;
        }
        if (this.surname.compareTo(author22.surname) == 0) {
            return this.name.compareTo(author22.name);
        }
        return this.surname.compareTo(author22.surname);
    }
}
