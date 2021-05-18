import java.util.List;

public class JDBCRunner {

    public static void main(String[] args) {
        MonthService service = new MonthService();
        List<Month> allMonth = service.getAllMonth();
        System.out.println(allMonth);
    }
}
