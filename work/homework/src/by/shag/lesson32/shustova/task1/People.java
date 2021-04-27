package by.shag.lesson32.shustova.task1;

import by.shag.lesson20.shustova.Book;

public class People {

    private final String name;
    private final int age;
    private final Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object peopleAnother) {
        if (peopleAnother == null) {
            return false;
        }
        if (!(peopleAnother instanceof Book)) {
            return false;
        }
        People people = (People) peopleAnother;
        return (name == null) ? people.name == null : name.equals(people.name)
                && age == people.age
                && sex == people.sex;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 17;
        hashCode = prime * hashCode + ((name == null) ? 0 : name.hashCode());
        hashCode = prime * hashCode + age;
        hashCode = prime * hashCode + sex.hashCode();
        return hashCode;
    }
}
