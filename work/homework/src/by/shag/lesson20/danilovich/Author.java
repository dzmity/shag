package by.shag.lesson20.danilovich;

public class Author implements Comparable<Author> {

    private String name;
    private String lastname;

    @Override
    public String toString() {
        return "ФИО Автора: " + lastname + " " + name;
    }

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Author author) {
        int result = this.lastname.compareToIgnoreCase(author.lastname);
        if (result == 0) {
            result = this.name.compareToIgnoreCase(author.name);
        }
        return result;
    }
}
