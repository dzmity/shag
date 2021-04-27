package by.shag.lesson32.shustova;

import by.shag.lesson32.shustova.task1.People;
import by.shag.lesson32.shustova.task1.Sex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

        List<People> peopleList = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Aлена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        //1) Выбрать мужчин-военнообязанных (от 18 до 27 лет)
        peopleList.stream()
                .filter(p -> p.getAge() >= 18 &&
                        p.getAge() <= 27 &&
                        p.getSex() == Sex.MAN)
                .forEach(System.out::println);

        //2) Найти средний возраст среди мужчин
        Double avg = peopleList.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(p -> p.getAge())
                .average()
                .getAsDouble();
        System.out.printf("Средний возраст мужчин в списке= %.2f", avg);

        //3) Найти кол-во потенциально работоспособных людей в выборке
        //(т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)
        long count = peopleList.stream()
                .filter(p -> p.getAge() > 18 &&
                        ((p.getSex() == Sex.WOMEN && p.getAge() < 55) ||
                                (p.getSex() == Sex.MAN && p.getAge() < 60)))
                .count();
        System.out.printf("\nКол-во потенциально работоспособных людей = %d", count);

        //4 Отсортировать коллекцию людей по имени в обратном алфавитному порядке и собрать в сет
        Set<People> set = peopleList.stream()
                .sorted((p1, p2) -> -1 * p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toSet());
        System.out.println("\n  В Set = " + set);

        //5 Отсортировать коллекцию людей сначала по полу, а потом по возрасту и вывести 3-ий элемент
        peopleList.stream()
                .sorted((p1, p2) -> p1.getSex() != p2.getSex() ?
                        p1.getSex().compareTo(p2.getSex()) :
                        p1.getAge() - p2.getAge())
                .skip(2)
                .limit(1)
                .forEach(System.out::println);
        //6
        int asIntMax = peopleList.stream()
                .mapToInt(p -> p.getAge())
                .max()
                .getAsInt();
        System.out.printf("\nМаксимальный возраст в наборе = %d", asIntMax);

        //7
        int asIntMin = peopleList.stream()
                .mapToInt(p -> p.getAge())
                .min()
                .getAsInt();
        System.out.printf("\nМинимальный возраст в наборе = %d", asIntMin);

        //--------------часть 2--------------------------------
        List<String> list = Arrays.asList("a1", "b2", "c3", "a1");

        List<String> strings = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("\nКоллекция без дубликтов = " + strings);

        //2.2 Получить массив строк без дубликатов и в верхнем регистре
        Object[] array = list.stream()
                .distinct()
                .map(String::toUpperCase)
                .toArray();
        System.out.println(Arrays.toString(array));

        String str = list.stream()
                .collect(Collectors.joining(", ", "!!!", "!!!"))
                .toString();
        System.out.println("После объединения и обертывания символами !!!= " + str);

        Map<Character, Character> map = list.stream()
                .distinct()
                .collect(Collectors.toMap(p -> p.charAt(0), t -> t.charAt(1)));
        System.out.println("Map = первый символ ключ, второй символ значение = " + map);
    }
}
