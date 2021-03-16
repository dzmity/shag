package by.shag.lesson20.Gritskevich;

import java.util.Objects;

public class Illustrator implements Comparable<Illustrator> {

    private String name;
    private String lastName;

    public Illustrator(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Illustrator{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Illustrator illustrator = (Illustrator) o;
        return Objects.equals(this.name, illustrator.name)
                && Objects.equals(this.lastName, illustrator.lastName);
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + name.hashCode();
        hashCode = 31 * hashCode + lastName.hashCode();
        return hashCode;
    }

    @Override
    public int compareTo(Illustrator o) {
        return this.name.compareTo(o.name) * -1;
    }
}
