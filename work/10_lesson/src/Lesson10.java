public class Lesson10 {

    public static void main(String[] args) {
//        Human human = new Human(30, "Anton", 70.5);
//        Human human2 = new Human();
//        human2.setAge(17);
//        human2.setName("Lena");
//        human2.setWeightInKil0(40.5);
//
//        System.out.println(human.getHumanDescription());
//        System.out.println(human2.getHumanDescription());
//        human.age = 30;
//        human.name= "Anton";
//        human.weightInKil0 = 70.5;
//
//        int age = human.getAge();
//        String name = human.getName();
//        double weight = human.getWeightInKil0();

//        Money money = new Money(4L, (byte) 45);
//        System.out.println(money.getDescription());

//        Animal animal = new Animal();
//        animal.setColor("green");
//        animal.setHeight(0.05);
//        animal.setWeight(0.01);
//
//        animal.eat();
//        animal.move();

        Insect mosquito = new Insect();
        mosquito.setColor("black");
        mosquito.setHeight(0.02);
        mosquito.setWeight(0.0000001);
        mosquito.setEyesQuantity(2);

//        mosquito.eat();
//        mosquito.move();
//        System.out.println(mosquito.getDescription());

        Fish sh4uka = new Fish();
        sh4uka.setFinQuantity(4);
        sh4uka.setColor("grey");
        sh4uka.setWeight(7.0);
        sh4uka.setHeight(1);
//        sh4uka.move();

//        Animal[] mass = new Animal[2];
//        mass[0] = mosquito;
//        mass[1] = sh4uka;
//        for(Animal animal : mass) {
//            animal.move();
//        }

       cookAnimal(sh4uka);
       cookAnimal(mosquito);

    }

    public static void cookAnimal(Animal animal) {
        Fisherman valera = new Fisherman("Valera");
        Fish fish;
        if (animal instanceof Fish) {
            fish = (Fish) animal;
            valera.cooke(fish);
        } else  {
            System.out.println("Не рыба.");
        }

    }
}
