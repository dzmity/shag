package by.shag.lesson21;

public class HandleBar {

    private String color;
    private int weight;

    public HandleBar(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void right() {
        System.out.println("Руль вправо!");
    }

    public void left() {
        System.out.println("Руль влево!");
    }
}
