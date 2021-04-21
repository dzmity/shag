import java.util.Arrays;
import java.util.stream.Collectors;

public class Lesson32 {

    public static void main(String[] args) {
        var collection =  Arrays.asList("a1", "a2", "a3", "a1");

        // 1 Вернуть количество вхождений объекта "a1"
        // 2 Вернуть первый элемент коллекции или 0, если коллекция пуста
        // 3 Вернуть последний элемент коллекции или "empty", если коллекция пуста
        // 4 Найти элемент в коллекции равный "a3" или кинуть ошибку
        // 5 Вернуть третий элемент коллекции по порядку
        // 6 Вернуть два элемента начиная со второго
        // 7 Выбрать все элементы по шаблону
        // 8 Найти существуют ли хоть один "a1" элемент в коллекции
        // 8 Найти существуют ли хоть один "a8" элемент в коллекции
        // 8 Найти есть ли символ "1" у всех элементов коллекции
        // 8 Проверить что не существуют ни одного "a7" элемента в коллекции
        // 8
        // 8
        // 8
        // 8


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
