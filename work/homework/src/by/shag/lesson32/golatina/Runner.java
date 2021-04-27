package by.shag.lesson32.golatina;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<People> peopleList = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println("1) Выбрать мужчин-военнообязанных (от 18 до 27 лет) _ " + peopleList.stream()
                .filter(p -> p.getSex() == Sex.MAN && (p.getAge() >= 18 & p.getAge() <= 27))
                .collect(Collectors.toList())
        );

        System.out.println("2) Найти средний возраст среди мужчин _ " + peopleList.stream()
                .filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(People::getAge)
                .average()
        );

        System.out.println("3) Найти кол-во потенциально работоспособных людей в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60) _ "
                + peopleList.stream()
                .filter(p -> p.getSex() == Sex.MAN && (p.getAge() >= 18 & p.getAge() <= 60) ||
                        p.getSex() == Sex.WOMEN && (p.getAge() >= 18 & p.getAge() <= 55))
                .count()
        );

        System.out.println("4) Отсортировать коллекцию людей по имени в обратном алфавитному порядке и собрать в сет _ "
                + peopleList.stream()
                .sorted((p1,p2) -> p2.getName().compareTo(p1.getName()))
                .collect(Collectors.toCollection(LinkedHashSet::new))
        );

        System.out.println("5) Отсортировать коллекцию людей сначала по полу, а потом по возрасту и вывести 3-ий элемент _ "
                + peopleList.stream()
                .sorted((p1, p2) -> {
                    if (p1.getSex().toString().equals(p2.getSex().toString())) {
                        return p1.getAge() - p2.getAge();
                    } else {
                        return p1.getSex().compareTo(p2.getSex());
                    }
                })
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Люди закончились"))
        );

        System.out.println("6) Найдем человека с максимальным возрастом _ "
                + peopleList.stream()
                .max(Comparator.comparing(People::getAge))
        );

        System.out.println("7) Найдем человека с минимальным возрастом _ "
                + peopleList.stream()
                .min(Comparator.comparing(People::getAge))
        );

        List<String> stringList = Arrays.asList("a1", "b2", "c3", "a1");

        System.out.println("1) Вернуть новую коллекцию без дубликатов _ "
                + stringList.stream()
                .collect(Collectors.toSet())
        );

        System.out.println("2) Получить массив строк без дубликатов и в верхнем регистре _ "
                + Arrays.toString(stringList.stream()
                .distinct()
                .map(String::toUpperCase)
                .toArray())
        );

        System.out.println("3) Объединить все элементы в одну строку через разделитель: и \"обернуть\" ее символами !!! слева и справа _ "
                + stringList.stream()
                .collect(Collectors.joining("/", "!!!", "!!!"))
        );

        System.out.println("4) Преобразовать в map, где первый символ ключ, второй символ значение _ "
                + stringList.stream()
                .collect(Collectors.toMap(s -> s.toCharArray()[0], s -> s.toCharArray()[1], (k, v) -> v))
        );

    }

}
