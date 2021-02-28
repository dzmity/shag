package lesson17;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return 0;
//        int result = 0;
//        String name1 = product1.getName();
//        String name2 = product2.getName();
//        result = name1 == null ?
//                (name2 == null ? 0 : -1) : //  name1 == null  если name2 == null то 0 (равны)
//                                           // name1 == null  если name2 != null то -1 (первый меньше)
//                (name2 == null ? 1 : name1.compareTo(name2)); // name1 != null  если если name2 == null то 1 (первый больше)
//
//                                        // name1 != null  если если name2 != null то compare
//        if (result == 0) {
//            int price1 = product1.getPriceInCents();
//            int price2 = product2.getPriceInCents();
//            result = price1 - price2;
//        }
//
//
//        return result;
    }
}
