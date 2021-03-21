package by.shag.lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Runner {

    public static void main(String[] args) {

        String sentence = "Hello, world ,   hello";
        sentence = sentence.replace(",", " ");
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println(sentence);

        List<FishProduct> fishes = new ArrayList<>();
        FishProduct fish1 = new FishProduct("karp", 12.10, true);
        FishProduct fish2 = new FishProduct("semga", 20.23, true);
        FishProduct fish3 = new FishProduct("polosatic", 8.94, false);

        fishes.add(fish1);
        fishes.add(fish2);
        fishes.add(fish3);

        Comparator<FishProduct> nameComparator = new Comparator<FishProduct>() {
            @Override
            public int compare(FishProduct f1, FishProduct f2) {
                return f1.getName().compareTo(f2.getName());
            }
        };
//        fishes.sort(nameComparator);
//        fishes.sort((f1, f2) -> f1.getName().compareTo(f2.getName()));
//        fishes.sort((f1, f2) -> (int) (f1.getPrice() * 100 - f2.getPrice() * 100));
        FishProductUtil.sort(fishes, (f1, f2) -> (int) (f1.getPrice() * 100 - f2.getPrice() * 100));
        System.out.println(fishes);
        FishProductUtil.sort(fishes, (f1, f2) -> f1.getName().compareTo(f2.getName()));
        System.out.println(fishes);

        FishProductUtil.filter(fishes, f -> f.isFresh());
        FishProductUtil.filter(fishes, FishProduct::isFresh);
        FishProductUtil.filter(fishes, f -> f.getPrice() > 10.0);
        System.out.println(fishes);

        fishes.forEach(System.out::println);
//        lambdaMethod();
//        lambdaMethod2();


        BiFunction<Integer, Integer, Integer> function = (a, b) -> a * b;
        System.out.println(function.apply(5, 7));
    }


    public static void lambdaMethod() {

        Flyable bird = new Flyable() {

            @Override
            public void fly() {
                System.out.println("I'm a bird. I am flying.");
            }
        };

        Flyable bird2 = () -> System.out.println("I'm a bird2. I am flying.");
        bird2.fly();
        bird.fly();
    }

    public static void lambdaMethod2() {


        int a = 5;
        int b = 7;


        Lyamdable lyamdable1 = new Lyamdable() {
            @Override
            public String doSmth(String str1, String str2) {
                System.out.println("1st parameter = " + str1);
                System.out.println("2nd parameter = " + str2);
                return str2 + str1;
            }
        };

        Lyamdable lyamdable = (s1, s2) -> {
            System.out.println("1st parameter = " + s1);
            System.out.println("2nd parameter = " + s2);
            return s2 + s1;
        };
        System.out.println(lyamdable.doSmth("мыла раму", "мама "));
    }

}
