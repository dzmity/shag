import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson32 {

    public static void main(String[] args) {
        Optional<HumanNew3> first = Stream.of(
                new HumanNew3("Dima", 29, List.of(9, 10)),
                new HumanNew3("Anton", 40, List.of(8, 7, 4)),
                new HumanNew3("Maria", 18, List.of(2, 3, 4, 1)),
                new HumanNew3("Anton", 18, List.of(9, 9, 4, 1))
        )
//                .findFirst();
                .findAny();
        System.out.println(first.orElse(new HumanNew3("Valentina", 10, new ArrayList<>())));

        Stream.of(
                new HumanNew3("Dima", 29, List.of(9, 10)),
                new HumanNew3("Anton", 40, List.of(8, 7, 4)),
                new HumanNew3("Maria", 18, List.of(2, 3, 4, 1)),
                new HumanNew3("Anton", 18, List.of(9, 9, 4, 1))
        )

//        .collect(Collectors.toSet());
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




        List<String> collection =  List.of("a1", "a2", "a3", "a1");
        long count = collection.stream()
                .filter(str -> str.equals("a1"))
                .count();
        // 1 Вернуть количество вхождений объекта "a1"
        // 2 Вернуть первый элемент коллекции или 0, если коллекция пуста
        String s2 = collection.stream().findFirst().orElse("0");
        // 3 Вернуть последний элемент коллекции или "empty", если коллекция пуста
        String s3 = collection.stream().skip(collection.size() - 1).findFirst().orElse("empty");
        // 4 Найти элемент в коллекции равный "a3" или кинуть ошибку
        String s4 = collection.stream()
                .filter("a3"::equals)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("message"));
        // 5 Вернуть третий элемент коллекции по порядку
        String nothing = collection.stream()
                .skip(2)
                .findFirst()
                .orElse("nothing");
        // 6 Вернуть два элемента начиная со второго
        Object[] objects = collection.stream().skip(1).limit(2).toArray();
        // 7 Выбрать все элементы по шаблону - contains "1"
        List<String> collect = collection.stream().filter(str -> str.contains("1")).collect(Collectors.toList());
        // 8 Найти существуют ли хоть один "a1" элемент в коллекции
        collection.stream().anyMatch("a1"::equals);
        // 9 Найти существуют ли хоть один "a8" элемент в коллекции
        collection.stream().anyMatch("a8"::equals);
        // 10 Найти есть ли символ "1" у всех элементов коллекции
        collection.stream().allMatch(str -> str.contains("1"));
        // 11 Проверить что не существуют ни одного "a7" элемента в коллекции
        collection.stream().noneMatch("a7"::equals);
        // 12 Добавить "_000" к каждому элементу и собрать в лист
        collect.stream().map(str -> str + "_000").collect(Collectors.toList());
        // 13 Убрать первый символ в каждом элементе и собрать в массиы
        collect.stream().map(str -> str.substring(1, 3)).collect(Collectors.toList());
        // 14 Сделать стрим из 2-х элементов "1,2,3" и "45,667" и собрать все числа, указанные
        // через запятую, в сет
        // 15 посчитать среднеарифметическое из чисел выше
        // 16 Отсортировать первую коллекцию по алфавиту и собрать в лист
        // 17 Отсортировать первую коллекцию по алфавиту в обратном порядке,
        // удалить дубликаты и вывести все элементы на экран
        // 18 Вернуть сумму нечетных чисел или 0)
    }
}
