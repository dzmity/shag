import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomRunner {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Егор");
        map.put(2, "Шутова А.");
        map.put(3, "МАРИЯ");
        map.put(4, "Karpovich");
        map.put(5, "Жека Г.");
        map.put(6, "Макс");
        map.put(7, "Димон Математик");
        map.put(8, "Инкогнито");
        map.put(9, "Сергей");
        map.put(10, "Скромняга");
        map.put(11, "Литвинов Д.");
        map.put(12, "Антон");
        map.put(10, "Скромняга супер -1 балл");

        System.out.println("3 балла уходит "
                + map.get( (int) (Math.random() * 12 + 1)));
        System.out.println("1 балла уходит "
                + map.get( (int) (Math.random() * 12 + 1)));
        System.out.println("1 балла уходит "
                + map.get( (int) (Math.random() * 12 + 1)));
    }
}
