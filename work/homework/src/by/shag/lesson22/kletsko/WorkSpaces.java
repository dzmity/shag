package by.shag.lesson22.kletsko;

import java.util.function.Predicate;

public class WorkSpaces {

    public static void print(LambdaInterface res) {
        System.out.println(res.sum(3, 5, 7));
    }

    public static void searchElem(MaxAndMin res) {
        System.out.println(res.search(1, 3));
    }

    public static int calculateFactorial(int n){
        int res = 1;
        for (int i = 1; i <=n; i ++){
            res = res * i;
        }
        return res;
    }

    public static boolean checkNum(int num) {
        boolean check = true;
            for(int i =2; i < num; i++){
                if(num % i==0){
                    check = false;
                    break;
                }
            } return check;
    }

    public static void searchElem2(MaxAndMin2 res) {
        System.out.println(res.search(13, 3, 90));
    }

    public static void sum(int[] mass, Predicate<Integer> a) {
        Integer sum = 0;
        for (Integer i : mass) {
            if (a.test(i)) {
                sum += i;
            }
        }
        System.out.println("Сумма равна: " + sum);
    }

}
