public class Fisherman {

    private String name;

    public Fisherman(String name) {
        this.name = name;
    }

    public void cooke(Fish fish) {
        System.out.println("Я готовлю рыбу с плавниками = "
                + fish.getFinQuantity());
    }
}
