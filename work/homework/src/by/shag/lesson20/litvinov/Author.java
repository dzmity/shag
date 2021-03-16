package by.shag.lesson20.litvinov;

public class Author implements Comparable<Author> {

    private String name;
    private String lastName;

    public Author() {
    }

    public Author(String name, String lastName) {
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

        Author author = (Author) obj;
        return this.name != null && author.name != null && this.name.equals(author.name)
                && this.lastName != null && author.lastName != null && this.lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode = 31 * hashCode + (name == null ? 0 : name.hashCode());
        hashCode = 31 * hashCode + (lastName == null ? 0 : lastName.hashCode());
        return hashCode();
    }

    @Override
    public int compareTo(Author author) {
        return lastName.compareTo(author.lastName);
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
