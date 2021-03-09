package by.shag.lesson20;

public class Human implements Comparable<Human> {

    private String name;
    private String lastName;
    private int age;
    private Boolean hasHigherEducation;

    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Human(String name, String lastName, int age, Boolean hasHigherEducation) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hasHigherEducation = hasHigherEducation;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Boolean getHasHigherEducation() {
        return hasHigherEducation;
    }

    @Override
    public int compareTo(Human human) {
        int result = human.age - this.age;
        if (result == 0) {
            result = human.lastName.length() - this.lastName.length();
        }
        if (result == 0) {
            result = this.name.compareToIgnoreCase(human.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hasHigherEducation=" + hasHigherEducation +
                '}';
    }
}
