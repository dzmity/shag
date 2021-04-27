package by.shag.lesson32.timchuk_dz;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

        List<People> collection = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        List<People> collection1 = collection.stream()
                .filter(people -> people.getAge() > 18 && people.getAge() < 27)
                .filter(people -> people.getSex() == Sex.MAN)
                .collect(Collectors.toList());
        System.out.println(collection1);

        long count = collection.stream()
                .filter(people -> people.getSex() == Sex.MAN)
                .map(people -> people.getAge())
                .reduce(0, (p1, p2) -> p1 + p2);
        System.out.println("Cредний возраст среди мужчин = " + count);
        System.out.println(count);

        List<People> collection2 = collection.stream()
                .filter(people -> (((people.getAge() > 18 && people.getAge() < 60) && people.getSex() == Sex.MAN))
                        || ((people.getAge() > 18 && people.getAge() < 55) && people.getSex() == Sex.WOMEN))
                .collect(Collectors.toList());
        System.out.println(collection2);

        Set<People> collection3 = collection.stream()
                .unordered()
                .sorted((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()))
                //.forEachOrdered(people -> people.getName())
                .collect(Collectors.toSet());
        System.out.println(collection3);

        List<People> collection4 = collection.stream()
                .filter(p-> p.getSex() == Sex.MAN)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
        .collect(Collectors.toList());
        List<People> collection4_1 = collection.stream()
                .filter(p-> p.getSex() == Sex.WOMEN)
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .collect(Collectors.toList());
        collection4.addAll(collection4_1);
        System.out.println(collection4);

        Optional<People> max = collection.stream()
                .max((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(max);

        Optional<People> min = collection.stream()
                .min((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(min);
        System.out.println();

        List<String> collect = List.of("a1", "b2", "c3", "a1");
        List<String> collect1 = collect.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);

//        String[] collect2  =  collect.stream() // не работает
//                .distinct()
//                .map(String::toUpperCase)
//                .flatMap(s->s.toCharArray());



    }


}
