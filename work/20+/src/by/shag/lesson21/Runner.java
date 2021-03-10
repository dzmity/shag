package by.shag.lesson21;

public class Runner {

    public static void main(String[] args) {
        // У нас есть какой-то непонятный велосипедный руль (зачем он нужен? ).
        // И этот руль поворачивает вправо...сам по себе, без велосипеда...зачем-то.
        HandleBar handleBar = new HandleBar("red", 1100);
        handleBar.right();
    }
}
