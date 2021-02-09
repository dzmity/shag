public class Product {

    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public <T extends Product> boolean compare(T product) {
        return name.equals(product.getName())
                && price.equals(product.getPrice());
    }
}
