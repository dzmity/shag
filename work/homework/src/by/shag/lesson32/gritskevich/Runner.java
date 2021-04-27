package by.shag.lesson32.gritskevich;

import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<People> peopleList = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));

        System.out.println(getMilitaryPeople(peopleList));
        System.out.println(getManAvrAge(peopleList));
        System.out.println(getCountOfWorkingPeople(peopleList));
        System.out.println(sortedPeopleByTheNameAndCollectToSet(peopleList));
        System.out.println(sortedByTheSexThanByTheAgeAndGetThirdElement(peopleList));
        System.out.println(findPeopleWithMaxAge(peopleList));
        System.out.println(findPeopleWithMinAge(peopleList));

        Collection<String> stringCollection = Arrays.asList("a1", "b2", "c3", "a1");

        System.out.println(getCollectionWithoutDuplicate(stringCollection));
        System.out.println(Arrays.toString(getStringMassiveWithoutDuplicateAndInUpperCase(stringCollection)));
        System.out.println(concatenationAllElementsThroughSeparatorSndWrapItWithCharacters(stringCollection));
        System.out.println(transformToMapWhereFirstSymbolIsKeyAndSecondSymbolIsValue(stringCollection));


    }

    private static List<People> getMilitaryPeople(List<People> peopleList) {
        return peopleList.stream()
                .filter((x) -> (x.getSex() == Sex.MAN && x.getAge() >= 18 && x.getAge() < 27))
                .collect(Collectors.toList());
    }

    private static Double getManAvrAge(List<People> peopleList) {
        return peopleList.stream()
                .filter((x) -> x.getSex() == Sex.MAN)
                .mapToInt(People::getAge)
                .average()
                .getAsDouble();
    }

    private static Long getCountOfWorkingPeople(List<People> peopleList) {
        return peopleList.stream()
                .filter((x) -> ((x.getSex() == Sex.MAN && x.getAge() >= 18 && x.getAge() < 60)
                        || (x.getSex() == Sex.WOMEN && x.getAge() >= 18 && x.getAge() < 55)))
                .count();
    }

    private static Set<People> sortedPeopleByTheNameAndCollectToSet(List<People> peopleList) {
        return peopleList.stream()
                .sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
                .collect(Collectors.toSet());
    }

    private static Optional<People> sortedByTheSexThanByTheAgeAndGetThirdElement(List<People> peopleList) {
        return peopleList.stream()
                .sorted((x1, x2) -> x1.getSex() != x2.getSex() ?
                        x1.getSex().compareTo(x2.getSex()) :
                        x1.getAge().compareTo(x2.getAge()))
                .skip(2)
                .findFirst();
    }

    private static People findPeopleWithMaxAge(List<People> peopleList) {
        return peopleList.stream()
                .max((x1, x2) -> x1.getAge().compareTo(x2.getAge()))
                .get();
    }

    private static People findPeopleWithMinAge(List<People> peopleList) {
        return peopleList.stream()
                .min((x1, x2) -> x1.getAge().compareTo(x2.getAge()))
                .get();
    }


    private static List<String> getCollectionWithoutDuplicate(Collection<String> stringCollection) {
        return stringCollection.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private static String[] getStringMassiveWithoutDuplicateAndInUpperCase(Collection<String> stringCollection) {
        return stringCollection.stream()
                .distinct()
                .map(String::toUpperCase)
                .toArray(String[]::new);
    }

    private static String concatenationAllElementsThroughSeparatorSndWrapItWithCharacters(Collection<String> stringCollection) {
        return stringCollection.stream()
                .collect(Collectors.joining(":", "!!!", "!!!"));
    }

    private static Map<Object, Object> transformToMapWhereFirstSymbolIsKeyAndSecondSymbolIsValue(Collection<String> stringCollection) {
        return stringCollection.stream()
                .distinct()
                .collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
    }
}
