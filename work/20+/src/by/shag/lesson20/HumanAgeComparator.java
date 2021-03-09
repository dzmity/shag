package by.shag.lesson20;

import java.util.Comparator;

public class HumanAgeComparator implements Comparator<Human> {

    @Override
    public int compare(Human h1, Human h2) {
        return h1.getAge() - h2.getAge();
    }
}
