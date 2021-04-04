package by.shag.lesson21.litvinov;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Понедельник");
        list1.add("15/6 Катализатор");
        list1.add("фиалка");
        list1.add("собака");
        list1.add("весна");
        list1.add("Лед");
        list1.add("Кабина 2");
        list1.add("небо");
        list1.add("Атланты");
        list1.add("Пиранези");

        System.out.println("------------Список без сортировок--------------------------------");
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по длинне слова--------------------");
        ListManager.compareListByWordLength(list1);
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по первой букве алфавита-----------");
        ListManager.compareListByFirstLetterAlphabetical(list1);
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по последней букве алфавита--------");
        ListManager.compareLastLetterAlphabetical(list1);
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по длинне слов в обратном порядке--");
        ListManager.compareListByWordLengthReverse(list1);
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по первой букве в обратном порядке-");
        ListManager.compareListByFirstLetterReverseAlphabetical(list1);
        list1.forEach(System.out::println);

        System.out.println("------------Список сортировка по последней букве слова в обратном порядке-");
        ListManager.compareListByLastLetterReverseAlphabetical(list1);
        list1.forEach(System.out::println);
    }
}
