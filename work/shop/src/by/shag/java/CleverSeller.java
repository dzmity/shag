package by.shag.java;

public class CleverSeller {

    private final String name;
    private final VillageShop shop;
    private final CacheMachine cashMachine;

    public CleverSeller(String name, VillageShop shop, CacheMachine cashMachine) {
        this.name = name;
        this.shop = shop;
        this.cashMachine = cashMachine;
    }

    public void addProduct(Product product) {
        if (product instanceof Milk) {
            shop.getMilkShell().add((Milk) product);
        }
        if (product instanceof Bread) {
            shop.getBreadShell().add((Bread) product);
        }
    }

    public Milk getMilkFromShell() {
        Milk milk = shop.getMilkShell().poll();
        if (milk == null) {
            System.out.println("Сори, закончилось.");
            return null;
        }
        if (milk.isExpired()) {
            System.out.println("Простите, не заметил. Сча дам другое молоко.");
            return getMilkFromShell();
        }
        return milk;
    }

    public Bread getBreadFromShell() {
        Bread bread = shop.getBreadShell().poll();
        if (bread == null) {
            System.out.println("Сори, закончилось.");
            return null;
        }
        if (bread.isExpired()) {
            System.out.println("Простите, не заметил. Сча дам другой хлеб.");
            return getBreadFromShell();
        }
        return bread;
    }

    public int calculateTotalCost(Cart cart) {
        int totalPrice = 0;
        for (Product product : cart.getProducts()) {
            totalPrice += cashMachine.getPricesByCode().get(product.getCode());
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "CleverSeller{" +
                "name='" + name + '\'' +
                ", shop=" + shop +
                ", cacheMachine=" + cashMachine +
                '}';
    }
}
