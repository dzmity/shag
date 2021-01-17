package Савостьянчик

import java.util.Scanner;

public class Calculator {
    static double result;


    static public void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter two numbers: ");
        System.out.print("number1 = ");
        double number1 = scanner.nextDouble();

        System.out.print("number2 = ");
        double number2 = scanner.nextDouble();


        System.out.println("The sum of two numbers = " + sum(number1, number2));
        System.out.println("Difference of two numbers = " + difference(number1, number2));
        System.out.println("Multiplication of two numbers = " + multiply(number1, number2));
        System.out.println("Division of two numbers = " + division(number1, number2));

        System.out.println("-------------------");

        System.out.println("Enter number(will print the root of the number): ");
        System.out.print("number = ");
        int number = scanner.nextInt();

        System.out.println("Root of number = " + rootNumber(number));
        System.out.println("Number is negative: " + negativeNumber(number));


        System.out.println("There is a negative numbers: " + negativeNumbers(3,2,-5,6,1,7,5,3,7,8));


        System.out.println("Is the number prime: " + numberPrime(number));
    }

    static double sum(double number1, double number2) {
        result = number1 + number2;


        return result;
    }

    static double difference(double number1, double number2) {
        result = number1 - number2;


        return result;
    }

    static double multiply(double number1, double number2) {
        result = number1 * number2;


        return result;
    }

    static double division(double number1, double number2) {
        result = number1 / number2;


        return result;
    }

    static double rootNumber(int number) {
        result = Math.sqrt(number);


        return result;
    }

    static boolean negativeNumber(int number) {
        return number < 0;
    }

    static boolean negativeNumbers(int... numbers) {
        for (int number : numbers) {
            if (number < 0) {
                return true;
            }
        }
        return false;
    }

    static boolean numberPrime(int number) {
        if (number > 0) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
