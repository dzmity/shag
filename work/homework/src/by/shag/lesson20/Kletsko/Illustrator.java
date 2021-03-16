package by.shag.lesson20.Kletsko;

public class Illustrator {

    private String name;
    private String surname;

    public Illustrator(String name, String surname) {
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
        return "illustrator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public int compareTo(Illustrator illustrator2) {
        if (illustrator2 == null) {
            return 0;
        }
        if (this.surname.compareTo(illustrator2.surname) == 0) {
            return this.name.compareTo(illustrator2.name);
        }
        return this.surname.compareTo(illustrator2.surname);
    }
}
