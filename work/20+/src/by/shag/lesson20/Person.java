package by.shag.lesson20;

public class Person implements Comparable<Person> {

    private String name;
    private String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        int result = this.lastName.compareTo(person.lastName);
        if (result == 0) {
            result = -1 * this.name.compareTo(person.name);
        }
        return result;
    }
}
