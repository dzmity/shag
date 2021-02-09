package shag;

public class Calculator {

    public Double summ(Integer t1, Integer t2) {
        return (double) t1 + t2;
    }


    public Double summ(Long t1, Long t2) {
        return (double) t1 + t2;
    }


    public <T extends Number> Double summ(T t1, T t2) {
        return t1.doubleValue() + t2.doubleValue();
    }
}
