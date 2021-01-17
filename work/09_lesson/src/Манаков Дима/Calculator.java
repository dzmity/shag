package com.company;

public class Calculator {

    public static double summ(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public static double difference(double arg1, double arg2) {
        return arg1 - arg2;
    }

    public static double multiplication(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double division(double arg1, double arg2) {
        return arg1 / arg2;
    }

    public static int squareRoot(int arg1) {
        return (int) Math.sqrt(arg1);
    }

    public static int check(int arg1) {
        if (arg1 < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return arg1;
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }






        }







