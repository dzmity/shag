import java.util.List;

public class JDBCRunner {

    public static void main(String[] args) {
        MonthService service = new MonthService();
//        List<Month> allMonth = service.getAllMonth();
//        System.out.println(allMonth);

//        Month month = new Month(558, "java se", 104);
//        service.createWithPreparedStatement(month);


        StudentJ2020Service studentJ2020Service = new StudentJ2020Service();
        try {
            studentJ2020Service.create(new StudentJ2020("Дмитрий", "Рафалович", "+375-29-246-84-98"));
            studentJ2020Service.create(new StudentJ2020("Владислав", "Грицкевич", "+375(29)859-40-09"));
            studentJ2020Service.create(new StudentJ2020("Мария","Голятина","+375(29)110-06-41"));
            studentJ2020Service.create(new StudentJ2020("Евгений", "Карпович", "+37533 629-27-14"));
            studentJ2020Service.create(new StudentJ2020("Антон", "Литвинчук", "+375(25)627-63-48"));
            studentJ2020Service.create(new StudentJ2020("Анжела", "Шустова", "+375-29-349-40-25"));
            studentJ2020Service.create(new StudentJ2020("Sergey","Timchuk", "+375-29-610-53-30"));
            studentJ2020Service.create(new StudentJ2020("Дима", "Данилович",  "+375-29-778-54-81"));
            studentJ2020Service.create(new StudentJ2020("Максим", "Клецко", "+375-29-167-16-78"));
            studentJ2020Service.create(new StudentJ2020("Егор", "Савостьянчик", "+375-29-350-24-58"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
