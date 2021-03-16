package by.shag.lesson22;

public class FishProduct {

    private String name;
    private double price;
    private boolean fresh;

    public FishProduct(String name, double price, boolean fresh) {
        this.name = name;
        this.price = price;
        this.fresh = fresh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }


    @Override
    public String toString() {
        return "FishProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fresh=" + fresh +
                '}';
    }
}
