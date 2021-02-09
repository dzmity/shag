package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Lesson15 {

    public static void main(String[] args) {
        String[] mass = new String[10];
        Collection<String> stringList = new ArrayList<>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String3");
        System.out.println(stringList.contains("String3"));
        System.out.println(stringList.isEmpty());
        stringList.clear();
        System.out.println(stringList.isEmpty());
        Collection<String> stringList2 = new LinkedList<>();
        stringList2.add("bla");
        stringList.addAll(stringList2);
        System.out.println(stringList.size());
        stringList.remove("123");
        System.out.println(stringList.isEmpty());

        List<String> stringList3 = new ArrayList<>();
        stringList3.add("String1"); //0
        stringList3.add("String2"); //1
        stringList3.add("String3");  //2
        System.out.println(stringList3.get(0));
        stringList3.add(2, "Dima");
        System.out.println(stringList3.get(2));
        stringList3.remove(0);
    }

}
