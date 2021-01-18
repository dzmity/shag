public class Trainer {

    String name;

    public void train(Student student) {
        boolean urgent = true;
        student.doHomework(urgent);
        student.mark = 2;
    }

}
