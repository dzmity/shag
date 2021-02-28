package lesson17;

import java.util.Objects;

public final class Product/* implements Comparable<Product> */{

    private String name;
//    private int priceInCents;
    private double weight;
    private int code;

    public Product(String name, double weight, int code) {
        this.name = name;
//        this.priceInCents = priceInCents;
        this.weight = weight;
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    //    public String getName() {
//        return name;
//    }
//
//    public int getPriceInCents() {
//        return priceInCents;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPriceInCents(int priceInCents) {
//        this.priceInCents = priceInCents;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        if (! (o instanceof Product)) {
//            return false;
//        }
//        Product product = (Product) o;
//        if (this == o) {
//            return true;
//        }
//        boolean equals = false;
//        equals = this.priceInCents == product.priceInCents
//                && this.weight == product.weight
//                && (this.name == null ?
//                product.name == null :
//                this.name.equals(product.name));
//        return equals;
//    }
//
//    @Override
//    public int hashCode() {
//        int hashCode = 17;
//        hashCode = 31 * hashCode + priceInCents;
//        hashCode = 31 * hashCode + (int) weight;
//        hashCode = 31 * hashCode + (name == null ? 0 : name.hashCode());
//        return hashCode;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", priceInCents=" + priceInCents +
//                ", weight=" + weight +
//                '}';
//    }
/*
    @Override
    public int compareTo(Product product) {
        if(name == null) {
            return 0;
        }
        int value = name.compareTo(product.name); //1
        if (value == 0) { // 2
            value = priceInCents - product.priceInCents;
        }
        if (value == 0) {
            //0.5 0.37  1.99 1.0
            value = (int) (weight * 1000 - product.weight * 1000);
        }
        return value;
    }*/
}
