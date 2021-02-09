package shag;

public class Runner777 {

    public static void main(String[] args) {

        Box intBox = new Box();
        intBox.setItem(12);
        ////// code
//        intBox.setItem("hello");
        ////// code

        Object item = intBox.getItem();



        Box stringBox = new Box();
//        stringBox.setItem("Hello world.");

        ///// code
//        String item1 = (String) stringBox.getItem();


        Box<Integer> integerBox = new Box<>();
//        integerBox.setItem("hello");
        Integer item2 = integerBox.getItem();

//        Box<String> stringBox1 = new Box<>();

//        Box<Box> boxBox = new Box<>();
        Box<Long> longBox = new Box<>();
        Box<Double> doubleBox = new Box<>();
    }

}
