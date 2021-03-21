package by.shag.lesson21.kletsko;

import by.shag.lesson21.kletsko.ListManager;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Maxim");
        str.add("Evgeniy");
        str.add("Ann");
        str.add("Petr");

        System.out.println("Начальный массив:");
        System.out.println(str.toString());
        System.out.println("Comparator(сортировка по длине):");
        ListManager.sortList(str);
        System.out.println(str.toString());

        System.out.println("Static Nested(сортировка по первой букве):");
        ListManager.sortListNested(str);
        System.out.println(str.toString());

        System.out.println("Non-static Inner(сортировка по последней букве):");
        ListManager listManager = new ListManager();
        listManager.sortListInner(str);
        System.out.println(str.toString());

        System.out.println("Local(сортировка по длине в обратном порядке):");
        ListManager.localSort(str);
        System.out.println(str.toString());

        System.out.println("Anonim(сортировка по первой букве в обратном порядке):");
        ListManager.anonSort(str);
        System.out.println(str.toString());

        System.out.println("Lambda(сортировка по последней букве слова в обратном порядке):");
        ListManager.lambdaSort(str);
        System.out.println(str.toString());
    }

}
