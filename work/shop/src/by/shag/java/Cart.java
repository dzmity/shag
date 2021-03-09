package by.shag.java;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void addProductToCart(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
