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

        // Имена переменных  не могут содержать пробелов, символов +,- и т.д
        int a, b, c;

        int d;

        // играет роль, какие буквы ты напишешь – большие или маленькие
        // int a    не то же самое, что     int A
        int A, B, C;


        // строки можно склеивать при помощи знака +
        String s = "Java" + " is the best";

        // строки можно склеиват с другими примитивами. результатом будет строка
        String s1 = s + 12;

    }
}
