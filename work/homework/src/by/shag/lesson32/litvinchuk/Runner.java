package by.shag.lesson32.litvinchuk;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<People> people = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        List<People> people1 = people.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 27)
                .collect(Collectors.toList());
        System.out.println(people1);

        Double d = people.stream()
                .filter(p -> p.getSex().equals(Sex.MAN))
                .mapToInt(p -> p.getAge())
                .average()
                .orElse(0);
        System.out.println(d);

        long peopleMan = people.stream()
                .filter(p -> p.getSex().equals(Sex.MAN) && p.getAge() >= 18 && p.getAge() <= 60)
                .count();
        long workingPeople = peopleMan + people.stream()
                .filter(p -> p.getSex().equals(Sex.WOMEN) && p.getAge() >= 18 && p.getAge() <= 55)
                .count();
        System.out.println(workingPeople);

        Set<People> people2 = people.stream()
                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .collect(Collectors.toSet());

        Optional<People> optional = people.stream()
                .sorted((a, b) -> a.getSex().compareTo(b.getSex()))
                .sorted((a, b) -> a.getAge().compareTo(b.getAge()))
                .skip(2)
                .findFirst();
        People p = optional.get();
        System.out.println(p);

        Optional<People> people3 = people.stream()
                .max((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(people3);

        Optional<People> people4 = people.stream()
                .min((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(people4);

        List<String> collection = List.of("a1", "b2", "c3", "a1");

        List<String> collection1 = collection.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collection1);

        String[] collection2 = collection.stream()
                .distinct()
                .map(String::toUpperCase)
                .toArray(String[]::new);
        for (String s : collection2) {
            System.out.println(s);
        }

        String stream = collection.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(".", "!!!", "!!!"));
        System.out.println(stream);

    }
}
