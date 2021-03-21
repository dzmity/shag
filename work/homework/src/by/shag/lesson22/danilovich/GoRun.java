package by.shag.lesson22.danilovich;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class GoRun {
    public static void main(String[] args) {

        SumTree sum = (a, b, c) -> System.out.println(a + b + c);
        sum.Result(5, 5, 4);

        SumTree wor = (a, b, c) -> System.out.println(a * b * c);
        wor.Result(5, 5, 5);

        DataTime time = () -> System.out.println(LocalTime.now());
        time.DataTimes();

        DataTime data = () -> System.out.println(LocalDate.now());
        data.DataTimes();


        BiFunction<Integer, Integer, Integer> max = Math::max;
        System.out.println(max.apply(-10, -5));

        BiFunction<Integer, Integer, Integer> min = Math::min;
        System.out.println(min.apply(99, 100));

        IntFunction<Integer> factorial = a -> {
            int r = 1;
            for (int i = 1; i <= a; i++) {
                r = r * i;
            }
            return r;
        };
        System.out.println(factorial.apply(5));

        IntPredicate simple = a -> {
            BigInteger as = BigInteger.valueOf(a);
            return as.isProbablePrime((int) Math.log(a));
        };
        System.out.println(simple.test(97));


        SumTree maxTree = (a, b, c) -> {
            if (a > b && a > c) {
                System.out.println(a);
            }
            if (b > a && b > c) {
                System.out.println(b);
            }
            if (c > a && c > b) {
                System.out.println(c);
            }
        };
        maxTree.Result(-55, -5, -2);

        SumTree minTree = (a, b, c) -> {
            if (a < b & a < c) {
                System.out.println(a);
            }
            if (b < a && b < c) {
                System.out.println(b);
            }
            if (c < a && c < b) {
                System.out.println(c);
            }
        };
        minTree.Result(-55, -5, -2);


        int[] mass = new int[]{-2, 3, 2, 5, 4, 55};
        SortLambda.sumMass(mass, a -> true);
        SortLambda.sumMass(mass, a -> (a % 2 == 0));
        SortLambda.sumMass(mass, a -> (a % 2 == 1));

        int idA = 2;
        int idB = 100;
        SortLambda.sumMass(mass, a -> (a >= idA && a <= idB));

        SortLambda.sumMass(mass, a -> ((a % idA) == 0));
    }
}
