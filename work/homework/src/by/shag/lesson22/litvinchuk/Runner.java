package by.shag.lesson22.litvinchuk;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.BinaryOperator;

public class Runner {

    public static int sumMass(int[]mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Lambdable lambdable = (i1, i2, i3) -> i1 + i2 + i3;
        System.out.println(lambdable.count(7, 8, 9));

        lambdable = (i1, i2, i3) -> i1 * i2 * i3;
        System.out.println(lambdable.count(7, 8, 9));

        LambdaOutPut lambdaOutPut = () -> System.out.println(LocalTime.now());
        lambdaOutPut.outPut();

        lambdaOutPut = () -> System.out.println(LocalDate.now());
        lambdaOutPut.outPut();

        BinaryOperator<Integer> binaryOperator = Math::max;
        System.out.println(binaryOperator.apply(3,25));

        binaryOperator = Math::min;
        System.out.println(binaryOperator.apply(11,12));

        LambdaFactorial lambdaFactorial = in -> {
                int factorial = 1;
                for (int i = 1; i < in; i++) {
                    factorial *= i;
                }
                return factorial;
        };

        System.out.println(lambdaFactorial.countFactorial(5));

        LambdaPrimeNumber primeNumber = in -> {
            boolean check = true;
            for (int i = 2; i < in; i++) {
                if (in % i == 0) {
                    check = false;
                    break;
                }
            }
            return check;
        };

        System.out.println(primeNumber.checkPrimeNumber(7));

        LambdaMinMax max = (i1, i2, i3) -> {
            int first = Math.max(i1 ,i2);
            return Math.max(first, i3);
        };

        System.out.println(max.count(9, 15, 4));

        LambdaMinMax min = (i1, i2, i3) -> {
            int first = Math.min(i1, i2);
            return Math.min(first, i3);
        };

        System.out.println(min.count(-33, 7, -15));

        LambdaMass lambdaMass = i -> {
            int[] mass = new int[i.length];
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (i[j] % 2 == 0) {
                    mass[count] = i[j];
                    count++;
                }
            }
            return mass;
        };

        int[] test = {7, 12, 15, 4, 6, 18, 24};

        System.out.println(sumMass(lambdaMass.sum(test)));

        LambdaMass lambdaMass1 = i -> {
            int[] mass = new int[i.length];
            int count = 0;
            for (int j = 0; j < mass.length; j++) {
                if (i[j] % 2 != 0) {
                    mass[count] = i[j];
                    count++;
                }
            }
            return mass;
        };

        LambdaMassFromAndTo lambdaMassFromAndTo = (mass, i, i1) -> {
            int[] copy = new int[mass.length];
            int count = 0;
            for (int j = 0; j < copy.length; j++) {
                if (mass[j] > i && mass[j] < i1) {
                    copy[count] = mass[j];
                    count++;
                }
            }
            return copy;
        };

        System.out.println(sumMass(lambdaMassFromAndTo.sortFromAndTo(test,8, 19)));

        LambdaMultiple lambdaMultiple = (mass, i) -> {
            int[] copy = new int[mass.length];
            int count = 0;
            for (int j = 0; j < copy.length; j++) {
                if (mass[j] % i == 0) {
                    copy[count] = mass[j];
                    count++;
                }
            }
            return copy;
        };

        System.out.println(sumMass(lambdaMultiple.multipleOf(test, 6)));


    }
}
