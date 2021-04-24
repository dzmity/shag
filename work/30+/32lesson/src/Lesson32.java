import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson32 {

    public static void main(String[] args) {
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


        collection.stream().filter("a1"::equals).count();






        collection.stream().findFirst().orElse("0");





        collection.stream().skip(collection.size() - 1).findAny().orElse("empty");
        collection.stream().filter("a3"::equals).findFirst().get();
        collection.stream().skip(2).findFirst().get();
        collection.stream().skip(1).limit(2).toArray();
        collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());


        collection.stream().anyMatch("a1"::equals);
        collection.stream().anyMatch("a8"::equals);
        collection.stream().allMatch((s) -> s.contains("1"));
        collection.stream().noneMatch("a7"::equals);
    }
}
