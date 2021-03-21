package by.shag.lesson22.shustova;

import java.time.LocalDate;
import java.time.LocalTime;

public class Runner {

    public static void main(String[] main) {

        ArithmeticOfTree res1 = (int a, int b, int c) -> a + b + c;
        System.out.println(res1.operation(5, 6, 10));

        ArithmeticOfTree res2 = (int a, int b, int c) -> a * b * c;
        System.out.println(res2.operation(5, 6, 10));

        DateOrTimeNow res3 = () -> {
            System.out.println(LocalDate.now());
        };
        res3.run();

        DateOrTimeNow res4 = () -> {
            System.out.println(LocalTime.now());
        };
        res4.run();

        MaxOrMinNumbers res5 = Math::max;
        System.out.println(res5.result(0, 200));

        MaxOrMinNumbers res6 = Math::min;
        System.out.println(res6.result(0, 200));

        Factorial res7 = a -> {
            int result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(res7.factorial(3));

        PrimeNumber res8 = a -> {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Простое число? " + res8.isPrimeNumber(17));

        MaxOrMinOfTreeNumber res9 = (a, b, c) -> Math.max(Math.max(a, b), c);
        System.out.println(res9.res(20, 101, 3));

        MaxOrMinOfTreeNumber res10 = (a, b, c) -> Math.min(Math.min(a, b), c);
        System.out.println(res10.res(20, 101, 3));

        int[] myArray = {1, 2, 3, 5, 90, 12, 10};
        PredicateMy isEven = n -> n % 2 == 0;
        PredicateMy isOdd = n -> n % 2 != 0;

        final int highLevel = 30;
        final int lowLevel = 5;
        final int divider = 5;

        PredicateMy isLimit = n -> (n > lowLevel) && (n < highLevel);
        PredicateMy isMultiplicity = n -> (n % divider == 0);
        System.out.println("Сумма четных чисел = " + summa2(myArray, isEven));
        System.out.println("Сумма нечетных чисел = " + summa2(myArray, isOdd));
        System.out.println("Сумма  чисел (5..30) = " + summa2(myArray, isLimit));
        System.out.println("Сумма  чисел кратное (5) = " + summa2(myArray, isMultiplicity));
    }

    private static int summa2(int[] myArray, PredicateMy answer) {
        int sum = 0;
        for (int element : myArray) {
            if (answer.func(element)) {
                sum += element;
            }
        }
        return sum;
    }
}