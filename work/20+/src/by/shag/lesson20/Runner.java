package by.shag.lesson20;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import by.shag.lesson20.annotation.HumanLastNameComparator;
import by.shag.lesson20.equals.Car;
import by.shag.lesson20.equals.EquipmentType;

public class Runner {

    public static void main(String[] args) {


//        Set<Student> students = new TreeSet<>();
//        Student dima = new Student("Dima");
//        Student dima2 = new Student("Dima");
//        Student anton = new Student("Anton");
//        Student julya = new Student("Julya");
//        Student sergey = new Student("Sergey");
//        Student vova = new Student("Vova");
//
//        students.add(dima);
//        students.add(dima2);
//        students.add(anton);
//        students.add(julya);
//        students.add(sergey);
//        students.add(vova);
//
//        System.out.println(students);

//        Set<Person> persons = new TreeSet<>();
//        Person dima = new Person("Dima", "Abc");
//        Person dima2 = new Person("Dima", "Abc");
//        Person anton = new Person("Anton", "Zaaaa");
//        Person julya = new Person("Julya", "Zaaaa");
//        Person sergey = new Person("Sergey", "Lm");
//        Person vova = new Person("Vova", "Rst");
//
//        persons.add(dima);
//        persons.add(dima2);
//        persons.add(anton);
//        persons.add(julya);
//        persons.add(sergey);
//        persons.add(vova);
//
//        System.out.println(persons);


//        Set<Human> humans = new TreeSet<>(new HumanAgeComparator());
//        Set<Human> humans = new TreeSet<>(new HumanLastNameComparator());
//        Set<Human> humans = new TreeSet<>(
//                new HumanLastNameComparator().reversed()
//                        .thenComparing(new HumanAgeComparator()));
//        Human dima = new Human("Dima", "Abc", 45);
//        Human dima2 = new Human("Dima", "Abc", 12);
//        Human anton = new Human("Anton", "Zaaaa", 12);
//        Human julya = new Human("Julya", "ZaAaa", 67);
//        Human sergey = new Human("sergey", "Lm", 5);
//        Human vova = new Human("Vova", "lM", 5);
//
//        humans.add(dima);
//        humans.add(dima2);
//        humans.add(anton);
//        humans.add(julya);
//        humans.add(sergey);
//        humans.add(vova);
//        System.out.println(humans);

        Car car1 = new Car("bmw", "5", 200, EquipmentType.PREMIUM);
        Car car2 = new Car("audi", "T100", 250, EquipmentType.ECONOMY);
        Car car3 = new Car("audi", "T200", 250, EquipmentType.BASE_PLUS);
        Car car4 = new Car("audi", "T100", 240, EquipmentType.BASE_PLUS);
        Car car5 = new Car(null, "T100", 250, EquipmentType.BASE_PLUS);
        Car car6 = new Car(null, "T100", 250, EquipmentType.PREMIUM);
        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        System.out.println(cars);

    }
}
