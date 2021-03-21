package by.shag.lesson22.kletsko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.lang.Runnable;

public class Task {

    public static void main(String[] args) {

            WorkSpaces.print((a, b, c) -> (a + b + c));

            WorkSpaces.print((a, b, c) -> (a * b * c));

            new Thread(() -> System.out.println(LocalTime.now())).start();

            new Thread(() -> System.out.println(LocalDate.now())).start();
        }
}
