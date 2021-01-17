public class HomeWorkReview {

    public void review() {

        // return (number < 0 ? true : false);
        // return (number != 0 ? true : false);


//        if (a < 0) {
//            return true;
//        } else {
//            return false;
//        }

//        for (int i = 2; i < a; i++){
//            if (a % i == 0){
//                check = false;
//                break;
//            } else {
//                check = true;
//                break;
//            }
//        }
//        return check;


//        public class task77 {


    }

    public static boolean check(int ... a) {
        boolean check = false;
        for (int i = 0; i < a.length ; i++) {
            if (a[i] < 0) {
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }

    public static boolean isSimpleNumber(int number) {
//        Принимать 1 целое число и определять является ли оно *простым числом. Возвращать true или false.
        if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        } else if (number < -3) {
            for (int i = -2; i > number; i--) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return (number != 0 ? true : false);
    }

    public static double task1(double num1, double num2) {
        return num1 + num2;
    }


    public static boolean task8(int num) {
        int [] arr = {2, 3, 5, 7};
        for (int i = 0; i < arr.length ; i++) {
            if (num <= 1 || (num % arr[i] == 0 && num != arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static double root(double b) {
        System.out.println(Math.sqrt(b));
        return b;
    }


    //gags
    public static boolean negative(double b) {
        boolean a = false;
        if (b > 0) {
            a = true;
        }
        System.out.println(a);
        return a;
    }


    public static boolean positiveNumber(int arg1) {
        if (arg1 < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean summa(int... arg) {

        for (int i = 0; i < arg.length; i++) {
            if (arg[i] < 0) {
                return true;
            }
        }
        return false;
    }


    public static void negativeNumbers(double... a) {
        boolean s = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                s = false;
                break;
            }
        }
        System.out.println(s);
    }


    public static void primeNumber(double a) {
        double b;
        boolean is = true;

        for (int i = 2; i <= a / 2; i++) {
            b = a % i;
            if (b == 0) {
                is = false;
            }
        }
        System.out.println(is);
    }

    public static boolean checkSimplyNumber(int arg) {

        if (arg > 0 && arg % 1 == 0 && arg % arg == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(int arg1) {
        if (arg1 < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        return arg1;
    }

}
