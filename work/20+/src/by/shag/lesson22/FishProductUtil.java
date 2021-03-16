package by.shag.lesson22;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class FishProductUtil {

    public static void sort(List<FishProduct> list, Comparator<FishProduct> comparator) {
        list.sort(comparator);
    }

    public static void filter(List<FishProduct> list, Predicate<FishProduct> predicate) {
        Iterator<FishProduct> iterator = list.iterator();
        while (iterator.hasNext()) {
            FishProduct fish = iterator.next();
            if(!predicate.test(fish)) {
                list.remove(fish);
            }
        }
    }
}
