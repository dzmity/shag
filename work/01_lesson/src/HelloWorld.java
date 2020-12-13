public class HelloWorld {

    // однострочный комметарий
    public static void main(String[] args) {
        /*
        блочный комметарий
         */
        System.out.println("Hello World");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.print(333);

        char ch = 's';
        char ch2 = '!';
        float fl = 0.07f;
        double db = 0.07;

        // Имена переменных  не могут содержать пробелов, символов +,- и т.д
        int a, b, c;

        a = 5;
        byte b1 = 12;
        byte b2 = 14;
        byte b3 = (byte) (b1 + b2);
        boolean bl;

        int e = 12;

        int d;

        // играет роль, какие буквы ты напишешь – большие или маленькие
        // int a    не то же самое, что     int A
        int A, B, C;


        String st = "dsfasdf";
        // строки можно склеивать при помощи знака +
        String s = "Java" + " is the best";

        // строки можно склеиват с другими примитивами. результатом будет строка
        String s1 = s + 12;

        // операторы
        http://www.mstu.edu.ru/study/materials/java/05.htm


        // Особенности специальных значений с плавающей точкой
        System.out.println(Math.sqrt(-1.0));
        System.out.println(0.0 / 0.0);
        System.out.println(1 / 0.0);
        System.out.println(-1 / 0.0);
    }
}
