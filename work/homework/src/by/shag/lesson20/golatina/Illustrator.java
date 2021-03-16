package by.shag.lesson20.golatina;

import java.util.Objects;

public class Illustrator implements Comparable<Illustrator> {

    private String name;

    private String surname;

    @Override
    public String toString() {
        return "Illustrator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Illustrator(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Illustrator)) return false;
        Illustrator illustrator = (Illustrator) o;
        return name.equalsIgnoreCase(illustrator.name) && surname.equalsIgnoreCase(illustrator.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname.toLowerCase(), name.toLowerCase());
    }

    @Override
    public int compareTo(Illustrator illustrator) {
        if (illustrator == null) {
            return 0;
        }
        if (this.name.compareToIgnoreCase(illustrator.name) == 0) {
            return this.surname.compareToIgnoreCase(illustrator.surname);
        }
        return this.name.compareToIgnoreCase(illustrator.name);
    }

}
