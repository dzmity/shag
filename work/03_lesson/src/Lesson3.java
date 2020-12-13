public class Lesson3 {

    public static void main(String[] args) {
        boolean t = 5 < 3 & 5 > 3;
        System.out.println(t);



        int i;
        i= t ? 5 : 7;
        System.out.println(i);

        int x = 1;
        int y = 2;
        // для лучшего чтения кода рекомендуется брать  условие в скобки
        int a = (x != y) ? x : y;
    }
}
