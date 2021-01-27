public abstract class FourCornerShape extends Shape {

    protected double size1;
    protected double size2;

    public FourCornerShape(double size01, double size02) {
        size1 = size01;
        size2 = size02;
    }

    @Override
    public double getPerimeter() {
        return 2 * (size1 + size2);
    }
}
