package by.shag.lesson20.annotation;

import java.util.Comparator;

import by.shag.lesson20.Human;

public class HumanLastNameComparator implements Comparator<Human> {

    @Override
    public int compare(Human h1, Human h2) {
        return -1 * (h1.getLastName().length() - h2.getLastName().length());
    }
}
