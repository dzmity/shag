public class Human {

    private int age;
    private String name;
    private double weightInKil0;
    private String humanDescription;

    public Human(int age, String name, double weightInKil0) {
        this.age = age;
        this.name = name;
        this.weightInKil0 = weightInKil0;
        this.humanDescription = "Name = " + name + ", age= "
                +  age + ", weight = " + weightInKil0;
    }

    public Human() {
    }


    public String getHumanDescription() {
        return "Name = " + name + ", age= "
                +  age + ", weight = " + weightInKil0;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getWeightInKil0() {
        return weightInKil0;
    }


    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Forbidden.");
        } else  {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeightInKil0(double weightInKil0) {
        this.weightInKil0 = weightInKil0;
    }
}
