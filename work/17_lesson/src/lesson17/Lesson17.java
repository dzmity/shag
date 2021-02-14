package lesson17;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;

public class Lesson17 {


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2020, 12, 3);
        date.isAfter(secondDate);
        date.isBefore(secondDate);


        PriorityQueue<Product> pq = new PriorityQueue<>();
    }
}
