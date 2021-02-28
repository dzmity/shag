package lesson17;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Lesson17 {


    public static void main(String[] args) {

       /* Set<Integer> set = new HashSet<>();
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
        Product product14 = new Product("Meet", 400, 0.4);
        Product product15 = new Product("Oil", 800, 1.0);
//        Set<Product> productSet = new TreeSet<>(new ProductComparator());
//        productSet.add(product11);
//        productSet.add(product12);
//        productSet.add(product13);
//        productSet.add(product14);
//        productSet.add(product15);
//        System.out.println(productSet);

        ArrayDeque<Product> productQueue = new ArrayDeque<>();
        productQueue.add(product11);
        productQueue.add(product12);
        productQueue.add(product13);
        productQueue.add(product14);
        productQueue.add(product15);
//        System.out.println(productQueue);
//        System.out.println(productQueue.element());
        System.out.println(productQueue);
        System.out.println("------------");
        System.out.println(productQueue.poll());
        System.out.println(productQueue);
        System.out.println("------------");
        System.out.println(productQueue.remove());
        System.out.println(productQueue);
//        for( Product product : productQueue) {
//            productQueue.remove();
//        }


//        System.out.println("Сравнимаем что-то и null " + "aa".compareTo(null));


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(3, "aa");
        map.put(5, "aa");
        map.put(7, "aa");
        map.put(2, "bbb");
        System.out.println(map);
        map.put(1, "cc");
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        Collection<String> values = map.values();
        System.out.println("keys =" + keys);
        System.out.println("values =" + values);
        map.remove(1);
//        System.out.println(map);
//        map.clear(); //чистит колллекцию
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("aa"));

        Map<String, String> students = new HashMap<>();
        students.put("Savost", "Egor");
        System.out.println(students.get("Savost"));
        */

        Integer milkCode = 234324;
        Integer meetCode = 324234;
        Integer oilCode = 32987;
        Integer breadCode = 1233;

        Product milk = new Product("Milk", 200, milkCode);
        Product meet = new Product("Meet", 500, meetCode);
        Product bred = new Product("Bred", 100, breadCode);
        Product oil = new Product("Oil", 800, oilCode);

        Map<Integer, Integer> kassa = new HashMap<>();
        kassa.put(milkCode, 151);
        kassa.put(meetCode, 702);
        kassa.put(oilCode, 405);
        kassa.put(breadCode, 99);

        kassa.put(milkCode, 300);
        Collection<Product> cart = new LinkedList<>();
        cart.add(milk);
        cart.add(milk);
        cart.add(milk);
        cart.add(meet);
        cart.add(meet);
        cart.add(oil);
        cart.add(bred);

        int summa = 0;
        for (Product product: cart) {
            summa += kassa.get(product.getCode());
        }
        System.out.println("Заплатите = " + summa + "копеек");




        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate secondDate = LocalDate.of(2020, 12, 3);
        date.isAfter(secondDate);
        date.isBefore(secondDate);




        PriorityQueue<Product> pq = new PriorityQueue<>();
    }
}
