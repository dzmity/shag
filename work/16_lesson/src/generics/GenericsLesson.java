package generics;

public class GenericsLesson {

    public static void main(String[] args) {
        Box<Product> box  = new Box<>();
        box.setItem(new Phone());
        box.setItem(new Camera());
        box.setItem(new Product());

        // можем вставить строку
        Box<String> box2  = new Box<>();
        box2.setItem("ipad");
        // нужно ограничивать тип коробки - T extends Product

        // хотим сравнивать только продукты с камерой
        // нужно ограничивать тип коробки - T extends Product & HasCamera
        //
        // как наследуюется Box<Product> и Box<Camera>
        //
        // пишем корзину
        // не можем добавить Box<Camera>
        // ? extend Product
        //
        // Но можем сделать find(cameras, new Phone()) - как-то неправильно
        // <T extends Product>
    }
}
