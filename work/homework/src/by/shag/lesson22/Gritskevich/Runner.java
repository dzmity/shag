package by.shag.lesson22.Gritskevich;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.IntPredicate;
import java.util.stream.LongStream;

public class Runner {
    public static void main(String[] args) {

        ThreeNumbersCompositionAndSum<Integer> threeNumbersSum = (i1, i2, i3) -> i1 + i2 + i3;
        System.out.println(threeNumbersSum.intElementCompositionAndSum(45, 78, 35));

        ThreeNumbersCompositionAndSum<Integer> threeNumbersComposition = (i1, i2, i3) -> i1 * i2 * i3;
        System.out.println(threeNumbersComposition.intElementCompositionAndSum(3, 8, 19));

        GetLocalDateAndTimeNow<LocalDateTime> getLocalDateAndTimeNow = LocalDateTime::now;
        System.out.println(getLocalDateAndTimeNow.getLocalDateAndTime());

        GetLocalDateAndTimeNow<LocalDate> getLocalDateNow = LocalDate::now;
        System.out.println(getLocalDateNow.getLocalDateAndTime());

        GetMaxAndMinFromTwoNumbers<Integer> getMaxFromTwoNumbers = Math::max;
        System.out.println(getMaxFromTwoNumbers.getMaxAndMinFromTwoNumbers(25, 65));

        GetMaxAndMinFromTwoNumbers<Integer> getMinFromTwoNumbers = Math::min;
        System.out.println(getMinFromTwoNumbers.getMaxAndMinFromTwoNumbers(55, 87));

        GetFactorialFromNumber<Long> getFactorialFromNumber = l1 -> {
            if (l1 <= 1) {
                return 1L;
            } else {
                return LongStream.rangeClosed(2, l1).reduce((x, y) -> x * y).getAsLong();
            }
        };
        System.out.println(getFactorialFromNumber.getFactorialFromNumber(5L));

        CheckPrimeNumber<Boolean, Integer> checkPrimeNumber = u -> {
            BigInteger bigInteger = new BigInteger(String.valueOf(u));
            return bigInteger.isProbablePrime(u);
        };
        System.out.println(checkPrimeNumber.checkSimpleNumbers(26));

        GetMaxAndMinFromTheeNumber<Integer> getMaxFromTheeNumber = ((i1, i2, i3) -> Math.max(i1, Math.max(i2, i3)));
        System.out.println(getMaxFromTheeNumber.getMaxAndMinFromThreeNumbers(24, 55, 87));

        GetMaxAndMinFromTheeNumber<Integer> getMinFromTheeNumber = ((i1, i2, i3) -> Math.min(i1, Math.min(i2, i3)));
        System.out.println(getMinFromTheeNumber.getMaxAndMinFromThreeNumbers(29, 155, 57));

        System.out.println("---------------------------");

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        IntPredicate parityCheck = (a) -> a % 2 == 0;
        IntPredicate oddnessCheck = (a) -> a % 2 != 0;
        IntPredicate rangeCheck = (a) -> a > 2 && a < 8;
        IntPredicate multiplicityCheck = (a) -> a % 3 == 0;

        System.out.println(getSumWithChek(array, parityCheck));
        System.out.println(getSumWithChek(array, oddnessCheck));
        System.out.println(getSumWithChek(array, rangeCheck));
        System.out.println(getSumWithChek(array, multiplicityCheck));

    }

    static int getSumWithChek(int[] array, IntPredicate intPredicate) {
        int sum = 0;
        for (int j : array) {
            if (intPredicate.test(j)) {
                sum += array[j - 1];
            }
        }
        return sum;
    }
}