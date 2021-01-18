public class Student {

    String name;
    int mark;

    public Student() {
//        super();
        System.out.println("Вызвался конструктор класса Student");
        doHomework(true);
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public void doHomework(boolean urgent) {
        if (urgent) {
            System.out.println("begu begu");
        } else {
            System.out.println("mne pofig");
        }

        urgent = false;
    }

}
