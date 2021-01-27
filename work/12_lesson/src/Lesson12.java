public class Lesson12 {

    public static void main(String[] args) {

//        Shape shape = new Shape();
//        Rectangle rectangle = new Rectangle(3.0, 4.2);
//        System.out.println("Perimeter =" + rectangle.getPerimeter());
//        System.out.println("Square =" + rectangle.getSquare());
//        Shape circle1 = new Circle(1.5);
//        Shape circle2 = new Circle(2.5);
//        Shape circle3 = new Circle(3.5);
//        System.out.println("Perimeter 1 = " + circle1.getPerimeter());
//        System.out.println("Square 2 = " + circle1.getSquare());
//        System.out.println("Было создано " + Circle.instanceCount + " кругов");

//        Flyable plane = new Plane();
//        Flyable bird = new Bird(123);
//        plane.fly();
//        bird.fly();

        Magazine magazine = new Magazine("kalambur", 777);
        magazine.print();
        magazine.print("123");
        Book book = new Book("kniga", "aftar");
        book.print();




        //enum genre for book
//        switch(b1.bookType){
//            case CLASSIC:
//                System.out.println("Classic");
//                break;
//            case SCIENCE:
//                System.out.println("Science");
//                break;
//            case SCIENCE_FICTION:
//                System.out.println("Science fiction");
//                break;
//            case PHANTASY:
//                System.out.println("Phantasy");
//                break;
//        }
    }
}
