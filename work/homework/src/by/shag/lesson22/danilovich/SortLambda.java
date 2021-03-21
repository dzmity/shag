package by.shag.lesson22.danilovich;

import java.util.function.*;

public class SortLambda {

    public static void sumMass(int[] list, Predicate<Integer> predicate) {
        Integer sum = 0;
        for (Integer i : list) {
            if (predicate.test(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
