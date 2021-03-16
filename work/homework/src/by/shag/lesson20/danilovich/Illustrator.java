package by.shag.lesson20.danilovich;

public class Illustrator implements Comparable<Illustrator> {

    private String name;
    private String lastname;

    @Override
    public String toString() {
        return "ФИО илюстратора: " + lastname + " " + name;
    }

    public Illustrator(String name, String lastname) {
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
    public int compareTo(Illustrator illustrator) {
        return this.lastname.compareToIgnoreCase(illustrator.lastname);
    }
}
