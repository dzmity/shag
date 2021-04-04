package by.shag.lesson22.Karpovich;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Runner {

    private static int sumMass(int[] mass) {
        int sum= 0;
        for ( int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }

    private static int sumEvenInArray(int[] a, ChekParity chekParity) {
        int sum = 0;
        for (int i : a) {
            if(chekParity.isEven(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static int sumOddInArray(int[] a, ChekParity chekParity) {
        int sum = 0;
        for (int i : a) {
            if(!chekParity.isEven(i)) {
                sum += i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {



        CountSum countSum = ((arg1, arg2, arg3) -> arg1 + arg2 + arg3);

        CountMultiplication countMultiplication = ((arg1, arg2, arg3) -> arg1 * arg2 * arg3);

        OutputTime outputTime = () -> System.out.println(LocalTime.now());

        OutputDate outputDate = () -> System.out.println(LocalDate.now());

        OutputMaximumNumberOfTwo outputMaximumNumber = (arg1, arg2) -> System.out.println(Math.max(arg1, arg2));

        OutputMiminumNumberOfTwo outputMiminumNumber = (arg1, arg2) -> System.out.println(Math.min(arg1, arg2));

        OutputFactorialNumber outputFactorialNumber = arg1 -> {
            int factorial = 1;
            for (int i = 1; i < arg1; i++) {
                factorial = factorial * i;
            }
            return factorial;
        };

        ChekPrime chekPrime = () -> {
            boolean isPrime = true;
            int a;
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            for (int i = 2; i <= number / 2; i++) {
                a = number % i;
                if (a == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        };


        OutputMaximumNumberOfThree outputMaximumNumberOfThree = (arg1, arg2, arg3) -> {
            if (arg1 >= arg2 && arg1 >= arg3) {
                return arg1;
            } else if (arg2 >= arg1 && arg2 >= arg3) {
                return arg2;
            } else {
                return arg3;
            }
        };

        OutputMinimumOfThree outputMinimumOfThree = (arg1, arg2, arg3) -> {
            if (arg1 <= arg2 && arg1 <= arg3) {
                return arg1;
            } else if (arg2 <= arg1 && arg2 <= arg3) {
                return arg2;
            } else {
                return arg3;
            }
        };


        ChekParity chekParity = (arg1) -> arg1 % 2 == 0 ;
        int[] array1 = {1, 3, 4, 8, 10};

        OutputNumbersInDiapason outputNumbersInDiapason = (array , a, b) -> {
            int[] mass = new int[array.length];
            int count = 0;
            for (int i : array) {
                if ( i > a && i < b ) {
                    mass[count] = i;
                count++;
                }
            }
            return mass;

        };

        OutputEvenMass outputEvenMass = (array , a) -> {
            int[] mass = new int[array.length];
            int count = 0;
            for ( int i : array) {
                if (i %a == 0) {
                    mass[count] = i;
                    count++;
                }
            }
            return mass;
        };



        System.out.println(countSum.countingTheSumOffIntegers(4, 5, 5));
        System.out.println(countMultiplication.CountMultiplicationOfNumbers(2, 2, 2));
        outputTime.showTheCurrentTime();
        outputDate.showTheCurrentDate();
        outputMaximumNumber.showMaximumNumberOfTwo(3, 6);
        outputMiminumNumber.showMinimumNumberOfTwo(4, 8);
        outputFactorialNumber.showFactorialNumber(4);
        System.out.println(chekPrime.checkingNumberForSimplicity());
        System.out.println(outputMaximumNumberOfThree.showMaximumNumberOfThree(8, 3, 9));
        System.out.println(outputMinimumOfThree.showMinimumNumberOfThree(1, 3, 6));
        System.out.println(sumEvenInArray(array1, chekParity));
        System.out.println(sumOddInArray(array1, chekParity));
        System.out.println(sumMass(outputNumbersInDiapason.show(array1,2,12)));
        System.out.println(sumMass(outputEvenMass.showEvenMass(array1, 3)));
    }
}
