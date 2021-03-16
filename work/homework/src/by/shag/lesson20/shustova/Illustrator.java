package by.shag.lesson20.shustova;

public class Illustrator implements Comparable<Illustrator> {

    private final String name;
    private final String surname;

    public Illustrator(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "\nИллюстратор{" +
                "Имя='" + name + '\'' +
                ", Фамилия='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Illustrator illustratorAnother) {
        if (this.surname == null || illustratorAnother.surname == null) {
            return -1;
        }
        int result = -1 * this.surname.compareTo(illustratorAnother.surname);
        if (result == 0) {
            if (this.name == null || illustratorAnother.name == null) {
                return -1;
            } else {
                result = -1 * this.name.compareTo(illustratorAnother.name);
            }
        }
        return result;
    }
}