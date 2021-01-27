public class Circle extends Shape {

    public static final double PI = 3.14;
    public static int instanceCount = 0;
    private double radius;

    @Override
    public double getSquare() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
        instanceCount++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
