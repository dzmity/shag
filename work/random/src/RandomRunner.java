
import java.util.HashMap;
import java.util.Map;

public class RandomRunner {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Егор");
        map.put(2, "Шуcтова А.");
        map.put(3, "МАРИЯ");
        map.put(4, "Karpovich");
        map.put(6, "Макс");
        map.put(7, "Димон Математик");
        map.put(8, "Инкогнито");
        map.put(9, "Сергей");
        map.put(10, "Скромняга");
        map.put(11, "Литвинов Д.");
        map.put(5, "Антон");
        map.put(10, "Скромняга супер -1 балл");

        System.out.println("3 балла уходит "
                + map.get( (int) (Math.random() * 11 + 1)));
        System.out.println("1 балла уходит "
                + map.get( (int) (Math.random() * 11 + 1)));
        System.out.println("1 балла уходит "
                + map.get( (int) (Math.random() * 11 + 1)));
    }
}
