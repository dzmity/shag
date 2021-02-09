package generics;

import java.util.List;

public class Cart {

    public boolean find(List<Product> all, Product p) {
        for (Product sp : all) {
            if (sp.compare(p)) {
                return true;
            }
        }
        return false;
    }
}
