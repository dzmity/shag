package by.shag.lesson21.danilovich;

import java.util.ArrayList;
import java.util.List;

public class Go {
    public static void main(String[] args) {

        ListManager p = new ListManager();
        List<String> list = new ArrayList<>();
        list.add("Кристина");
        list.add("Генадий");
        list.add("Дима");
        list.add("Аня");
        list.add("В");
        list.add("Никита");

        System.out.println(p.printSortSize(list));
        System.out.println(p.printSortAbc(list));
        System.out.println(p.printSortCba(list));
        System.out.println(p.printSortSizeReversal(list));
        System.out.println(p.printSortAbcReversal(list));
    }
}
