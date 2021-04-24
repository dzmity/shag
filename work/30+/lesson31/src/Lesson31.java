import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson31 {

    public static void main(String[] args) {
//        List<String> list = List.of("123", "abc", "def");
//
//        Optional<List> optionalList = Optional.of(list);
//        Optional<String> optionalString1 = findInCollection(list,
//                (String s) -> s.equalsIgnoreCase("ABC"));


//        System.out.println(optionalString1.orElseThrow(() -> new RuntimeException("NO such element")));
//        optionalString1.orElseGet(() -> {
//            System.out.println("12345");
//            return "123";
//        });
//        optionalString1.orElse(returnSmth());



//        findInCollection(list, (String s) -> s == null);
//
//        Optional<String> optional = Optional.empty();
//        optional.isEmpty();
//        optional.isPresent();
//        optional.get();
//        String result = optional.orElse(null);
//        optional.orElseThrow(() -> new RuntimeException("123"));

//        List<String> list = List.of("123", "abc", "def");
//        long size = list.stream().count();
//        Stream<String> stringStream = Stream.of("123", "abc", "def");
//        String[] array = {"123", "abc", "def"};
//        Stream<String> stream = Arrays.stream(array);
//        String mother = "mother";
//        IntStream chars = mother.chars();
//        Stream<Object> objectStream = Stream.builder()
//                .add(1)
//                .add(2)
//                .add(5)
//                .build();
//        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 2);
//        Stream<Double> doubleStream = Stream.generate(() -> Math.random() * 100);

        List<Integer> collect = List.of("123", "1234", "12345", "3210", "23568", "23568", "90567", "98888", "9085670").stream()
                .peek(System.out::println)
                .filter(s -> s.length() < 7)
                .skip(2)
                .distinct()
                .map(Integer::parseInt) // (s -> s.toUpperCase())
                .limit(4)
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(collect);

        double average = List.of("1,23", "12,34", "1,2,3,4,5").stream()
                .flatMap(s -> Arrays.stream(s.split(",")))
                .mapToInt(Integer::parseInt)
                .average()
                .orElseGet(() -> 0);
        System.out.println(average);


        long max = Stream.of(
                new HumanNew("Dima", 29, List.of(9, 10)),
                new HumanNew("Anton", 40, List.of(8, 7, 4)),
                new HumanNew("Maria", 18, List.of(2, 3, 4, 1)))
                .flatMapToInt(humanNew -> humanNew.getMarks().stream().mapToInt(mark -> mark))
                .max().orElseGet(() -> 0);
        System.out.println(max);


        Optional<HumanNew> first = Stream.of(
                new HumanNew("Dima", 29, List.of(9, 10)),
                new HumanNew("Anton", 40, List.of(8, 7, 4)),
                new HumanNew("Maria", 18, List.of(2, 3, 4, 1)),
                new HumanNew("Anton", 18, List.of(9, 9, 4, 1))
        )
//                .findFirst();
        .findAny();
        System.out.println(first.orElse(new HumanNew("Valentina", 10, new ArrayList<>())));

        Stream.of(
                new HumanNew("Dima", 29, List.of(9, 10)),
                new HumanNew("Anton", 40, List.of(8, 7, 4)),
                new HumanNew("Maria", 18, List.of(2, 3, 4, 1)),
                new HumanNew("Anton", 18, List.of(9, 9, 4, 1))
        )

//                .collect(Collectors.toSet());
//        .count();
//        .anyMatch(humanNew -> humanNew.getName().equalsIgnoreCase("maria"))
//        .allMatch(humanNew -> !humanNew.getMarks().isEmpty());
//        .noneMatch(humanNew -> !humanNew.getMarks().isEmpty());
//        .max((h1, h2) -> h1.getAge() - h2.getAge());
//        .min((h1, h2) -> h1.getAge() - h2.getAge());
//        .forEach(humanNew -> System.out.println(humanNew));
//        .forEachOrdered(humanNew -> System.out.println(humanNew));
//        .toArray();
//        .map(HumanNew::getAge)
        .map(human -> human.getAge())
        .reduce((a1, a2) -> a1 * a2);
    }


    private static Optional<String> findInCollection(List<String> list, Predicate<String> predicate){
        for (String element : list) {
            if (predicate.test(element)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }

    private static String returnSmth() {
        System.out.println("or else");
        return "123";
    }
}
