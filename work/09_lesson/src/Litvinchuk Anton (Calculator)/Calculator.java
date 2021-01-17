public class Calculator {

    public static double add(double d, double d1) {
        return d + d1;
    }

    public static double subtract(double d, double d1) {
        return d - d1;
    }

    public static double multiply(double d, double d1) {
        return d * d1;
    }

    public static double divide(double d, double d1) {
        if (d1 != 0){
            return d / d1;
        }
        else {
            System.out.println("Деление на 0 невозможно!");
            return 0;
        }
    }

    public static double square(int i) {
        return Math.sqrt(i);
    }

    public static boolean checkForNegativity(int i) {
        if (i != 0){
            if (i < 0) {
                return true;
            }
            else {
                return false;
            }
        }
        System.out.println("число является 0");
        return false;
    }

    public static boolean checkForNegativityArray(int ... num) {
        boolean b = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                b = true;
            }
        }
        return b;
    }

    public static boolean checkPrimeNumber(int i) {
        boolean b = true;
        if (i > 1) {
           for (int j = 2; j < i; j++) {
               if (i % j == 0) {
                   b = false;
               }
           }
        }
        else {
            b = false;
        }
        return b;
    }

    public static void main(String[] args) {

    }
}
