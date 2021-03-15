package by.shag.lesson21;

public class Runner {

    public static void main(String[] args) {
        Seat seat0 = new Seat("read", 123);

        LimitedBicycle bicycle = new LimitedBicycle("bmx", "red", 3120);
        LimitedBicycle.LimitedSeat seat = bicycle.new LimitedSeat("blue", 1120);
        seat.doSomething();

        LimitedBicycle.LimitedHandleBar handleBar = new LimitedBicycle.LimitedHandleBar("yelow", 490);
        handleBar.left();

        Person person = new Person();
        person.throwRuntimeException();
        person.throwException();

        FormHandler handler = new FormHandler();

        Form form = new Form("sergey", "1995a ");
        try {
            handler.handle(form);
            System.out.println("123");
        } catch (Exception e) {
            handler.handleWithTrimWhitespaces(form);
        } finally {
            System.out.println("vsegda");
        }
        System.out.println(321);

        // У нас есть какой-то непонятный велосипедный руль (зачем он нужен? ).
        // И этот руль поворачивает вправо...сам по себе, без велосипеда...зачем-то.
//        HandleBar handleBar2 = new HandleBar("red", 1100);
//        handleBar.right();
    }
}
