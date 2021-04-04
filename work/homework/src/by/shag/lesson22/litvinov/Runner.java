package by.shag.lesson22.litvinov;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Runner {

    private final static Integer a = 5;
    private final static Integer b = 6;
    private final static Integer c = 7;

    public static void main(String[] args) {

        Calculate<Integer, Integer, Integer, Integer> sum = (x, y, z) -> x + y + z;
        System.out.println("Подсчет суммы трёх целых чисел: " + sum.run(a, b, c));

        Calculate<Integer, Integer, Integer, Integer> mult = (x, y, z) -> x * y * z;
        System.out.println("Подсчет произведения трёх целых чисел: " + mult.run(a, b, c));

        Supplier<LocalTime> time = LocalTime::now;
        System.out.println("Вывод текущего времени: " + time.get());

        Supplier<LocalDate> date = LocalDate::now;
        System.out.println("Вывод текущей даты: " + date.get());

        BiFunction<Integer, Integer, Integer> max = (s, d) -> (s < d ? d : s);
        System.out.println("Максимум из двух: " + max.apply(c, a));

        BiFunction<Integer, Integer, Integer> min = (f, e) -> (f < e ? f : e);
        System.out.println("Минимум из двух: " + min.apply(a, c));


        Function<Integer, Integer> factorial = (x) -> {
            int result = 1;

            for (int i = 1; i <= x; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println("Факториал числа <5> " + factorial.apply(a));


        Predicate<Integer> simplerNumber = (y) -> {
            boolean result = true;
            for (int i = 2; i < y; i++) {
                if (y % i == 0) {
                    result = false;
                }
            }
            return result;
        };
        System.out.println("Проверка простое число или нет: " + simplerNumber.test(c));


        Calculate<Integer, Integer, Integer, Integer> maximum = (x, y, z) -> Math.max(x, Math.max(y, z));
        System.out.println("Максимум из трёх: " + maximum.run(a, b, c));


        Calculate<Integer, Integer, Integer, Integer> minimum = (x, y, z) -> Math.min(x, Math.min(y, z));
        System.out.println("Минимум из трёх: " + minimum.run(a, b, c));


        Integer[] numbers = new Integer[]{3, 5, 8, 10, 11, 14, 16, 22, 39, 76};
        System.out.print("Элементы массива: ");
        for (Integer n : numbers) {
            System.out.print(n + "  ");
        }

        System.out.println("\n" + "Проверка на четность: " + sumOfArrayElementsByCondition(numbers, (n) -> n % 2 == 0));
        System.out.println("Проверка на нечетность: " + sumOfArrayElementsByCondition(numbers, (n) -> n % 2 != 0));
        System.out.println("Число находится в диапазоне от A до B: " +
                sumOfArrayElementsByCondition(numbers, (n) -> n > 5 && n < 16));
        System.out.println("Проверка на кратность параметру A: " +
                sumOfArrayElementsByCondition(numbers, (n) -> n % a == 0));
    }

    public static int sumOfArrayElementsByCondition(Integer[] numbers, Predicate<Integer> condition) {
        int sum = 0;
        for (Integer n : numbers) {
            if (condition.test(n)) {
                sum += n;
            }
        }
        return sum;
    }
}
