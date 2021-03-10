package by.shag.lesson21;

public class Seat {

    private String color;
    private int weight;

    public Seat(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void up() {
        System.out.println("Сиденье поднято выше!");
    }

    public void down() {
        System.out.println("Сиденье опущено ниже!");
    }
}
