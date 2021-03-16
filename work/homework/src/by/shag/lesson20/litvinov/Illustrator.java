package by.shag.lesson20.litvinov;

public class Illustrator implements Comparable<Illustrator> {

    private String name;
    private String lastName;

    public Illustrator() {
    }

    public Illustrator(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

        Illustrator illustrator = (Illustrator) obj;
        return this.name != null && illustrator.name != null && this.name.equals(illustrator.name)
                && this.lastName != null && illustrator.lastName != null && this.lastName.equals(illustrator.lastName);
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (name == null ? 0 : name.hashCode());
        hashCode = 31 * hashCode + (lastName == null ? 0 : lastName.hashCode());
        return hashCode();
    }

    @Override
    public int compareTo(Illustrator illustrator) {
        return -(name.compareTo(illustrator.name));
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
