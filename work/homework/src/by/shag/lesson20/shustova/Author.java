package by.shag.lesson20.shustova;

public class Author implements Comparable<Author> {

    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "\nАвтор{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Author authorAnother) {
        if (this.surname == null) {
            return 0;
        }
        int result = this.surname.compareTo(authorAnother.surname);
        if (result == 0) {
            if (this.name == null) {
                return 0;
            } else {
                result = this.name.compareTo(authorAnother.name);
            }
        }
        return result;
    }
}
