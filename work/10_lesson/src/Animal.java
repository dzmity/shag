public class Animal {

    private double height;
    private double weight;
    private String color;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("I'm eating.");
    }

    public void move() {
        System.out.println("I'm moving.");
    }

    public String getDescription() {
        return "" + weight + " " + height + " "  + color;
    }
}
