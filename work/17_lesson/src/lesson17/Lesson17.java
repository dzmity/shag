package lesson17;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Lesson17 {


    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);
        set.add(3);
        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("1");
        set2.add("1");

        System.out.println(set2);

        Set<Product> products = new HashSet<>();
        Product product1 = new Product("Milk", 200, 0.9);
        Product product2 = new Product("Meet", 500, 0.5);
        Product product4 = new Product("Meet", 500, 0.5);
//        Product product3 = product2;
        products.add(product1);
        products.add(product2);
//        product1.setName("abc");
        Product product3 = product1;
        products.add(product4);
        products.add(product3);
        System.out.println(products);
        System.out.println("Product 2 equals product 4 = "
                + product2.equals(product4));


        Set<Product> set1 = new HashSet<>(products);
        Set<Product> set3 = new HashSet<Product>(20, (float) 0.5);

//        Product product7 = null;
//        Product product8 = null;
//        product7.equals(product8);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(17);
        treeSet.add(5);
        treeSet.add(2);
        for (Integer i : treeSet) {
            System.out.println(i);
        }
        System.out.println(treeSet);

        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("aa");
        treeSet2.add("Aa");
        treeSet2.add("e");
        treeSet2.add("aaa");
        treeSet2.add("C");
        treeSet2.add("b");
        System.out.println(treeSet2);


        Product product11 = new Product("Milk", 200, 0.9);
        Product product12 = new Product("Meet", 500, 0.5);
        Product product13 = new Product("Bred", 100, 0.65);
        Product product14 = new Product("Meet", 500, 0.4);
        Product product15 = new Product("Oil", 800, 1.0);
        Set<Product> productSet = new TreeSet<>();
        productSet.add(product11);
        productSet.add(product12);
        productSet.add(product13);
        productSet.add(product14);
        productSet.add(product15);
        System.out.println(productSet);


        LocalDate date = LocalDate.now();
        LocalDate secondDate = LocalDate.of(2020, 12, 3);
        date.isAfter(secondDate);
        date.isBefore(secondDate);


        PriorityQueue<Product> pq = new PriorityQueue<>();
    }
}
