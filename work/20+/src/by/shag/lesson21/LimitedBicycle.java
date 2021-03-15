package by.shag.lesson21;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import lesson17.Product;
import lesson17.ProductComparator;

public class LimitedBicycle {
    public static int count = 0;
    private String model;
    private String color;
    private int weight;

    public LimitedBicycle(String model, String color, int weight) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        count++;
    }

    public static class LimitedHandleBar {
        private static int handleBarCount = 0;
        private String color;
        private int weight;

        public LimitedHandleBar(String color, int weight) {
            this.color = color;
            this.weight = weight;
            handleBarCount++;
        }

        public void right() {
            System.out.println("Руль вправо!" + count);
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }


    public String getDescription() {

        class Gag {
            private int count;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }
        Gag gag = new Gag();
        gag.setCount(5);
        return String.format("Description: model = %s, weight = %s, color = %s", model, weight, color);
    }

    public void compareAuthorsByName(List<Product> list) {

//        class ProductComparator implements Comparator<Product> {
//            @Override
//            public int compare(Product product1, Product product2) {
//                return product1.getName().compareTo(product2.getName());
//            }
//        }
        Set<Product> products = new TreeSet<>(new Comparator<Product>()  {
            private String name;

            public void doSmth() {
                System.out.println("doSmth");
            }

            @Override
            public int compare(Product product1, Product product2) {
                return product1.getName().compareTo(product2.getName());
            }
        });
        products.addAll(list);
        list.clear();
        list.addAll(products);


        Houme houme = new Houme( new Product() {

            private boolean isSliced;

            @Override
            public int getPriceInCents() {
                return 0;
            }
        });

        houme.getObject().getPriceInCents();
    }

    public class LimitedSeat {
        private String color;
        private int weight;

        public LimitedSeat(String color, int weight) {
            this.color = color;
            this.weight = weight;
        }

        public void up() {
            System.out.println("Сиденье поднято выше!");
        }

        public void doSomething() {
            System.out.println("Цвет седла " + color);
            System.out.println("Модель велосипеда " + model);
            System.out.println("Цвет моего велосипеда " + LimitedBicycle.this.color);
        }

        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }
    }
}
