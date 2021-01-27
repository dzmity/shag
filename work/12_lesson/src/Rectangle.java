public class Rectangle extends FourCornerShape {

//    private double with;
//    private double length;

    public Rectangle(double with, double length) {
        super(with, length);
//        super.size1 = with;
//        super.size2 = length;
    }

    @Override
    public double getSquare() {
//        return with * length;
        return size1 * size2;
    }

//    @Override
//    public double getPerimeter() {
//        return 2 * (with + length);
//    }
//
//    public double getWith() {
//        return with;
//    }
//
//    public void setWith(double with) {
//        this.with = with;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
}
