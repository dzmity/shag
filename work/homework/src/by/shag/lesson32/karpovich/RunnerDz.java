package by.shag.lesson32.karpovich;

import java.util.*;
import java.util.stream.Collectors;

public class RunnerDz {

    public static void main(String[] args) {

        ArrayList<People> peopleList = new ArrayList<>();
        Collections.addAll(peopleList,
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));


        List<People> collectionLiableForMilitaryServiceMan = peopleList.stream()
                .filter(p -> p.getAge() >= 18 && p.getAge() <= 27)
                .collect(Collectors.toList());


        double averageAgeForMan = peopleList.stream()
                .filter(a -> Sex.MAN.equals(a.getSex()))
                .mapToInt(People::getAge)
                .average()
                .orElse(0);


        long collectionWorkableMan = peopleList.stream()
                .filter(p -> p.getSex().equals(Sex.MAN) && p.getAge() >= 18 && p.getAge() <= 60)
                .count();
        long collectionWorkableWoman = peopleList.stream()
                .filter(p -> p.getSex().equals(Sex.WOMEN) && p.getAge() >= 18 && p.getAge() <= 55)
                .count();
        long collectionWorkablePeople = collectionWorkableMan + collectionWorkableWoman;


        LinkedHashSet<People> collectionPeopleByNameInReverseOrder = peopleList.stream()
//                .sorted((a, b) -> b.getName().compareTo(a.getName()))
                .sorted(new PeopleNameComparator())
                .collect(Collectors.toCollection(LinkedHashSet::new));


        Optional<People> collectionWithFiltersBySexAndAgeAndOutputЕThirdElement = peopleList.stream()
                .sorted(new PeopleSexComparator())
                .sorted(new PeopleAgeComparator())
                .skip(2)
                .findFirst();


        Optional<People> theOldestPeople = peopleList.stream()
                .max(Comparator.comparingInt(People::getAge));


        Optional<People> theYoungestPeople = peopleList.stream()
                .min(Comparator.comparingInt(People::getAge));


        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "a1", "b2", "c3", "a1");


        List<String> collectionWithoutDuplicates = stringList.stream()
                .distinct()
                .collect(Collectors.toList());


        Object[] arrayStringWithoutDuplicatesAndInToUpperCase = stringList.stream()
                .map(String::toUpperCase)
                .distinct()
                .toArray();


        String combineAllElementsIntoOneLineThroughASeparator = stringList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("/", "!!!", "!!!"));


    }
}
