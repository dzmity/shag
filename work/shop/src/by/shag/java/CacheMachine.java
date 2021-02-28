package by.shag.java;

import java.util.HashMap;
import java.util.Map;

public class CacheMachine {

    private final Map<Integer, Integer> pricesByCode = new HashMap<>();

    public Map<Integer, Integer> getPricesByCode() {
        return pricesByCode;
    }

    public void addProductPrice(int code, int priceInCents) {
        pricesByCode.put(code, priceInCents);
    }
}
