import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson7 {

    public static void main(String[] args) {

//        System.out.print("abc\r\n\"");
//        System.out.print("def");






        String a1 = "123";  // string pool
        String a2 = new String("123"); //
        String a3 = "123";
        a3 = "cde";
        String a4 = new String("123");
//
//        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
//        System.out.println(a2 == a3);
//        System.out.println(a2 == a4);

        // concat
        String firstName = "Иван";

//        String lastName = "Иванов";
//        String fullName = firstName.concat(lastName);
//        System.out.println(fullName);


//        System.out.println(firstName.length());
//        System.out.println(firstName.isEmpty());
//        System.out.println(firstName.charAt(2));

        // contains, startWith, endsWith
        String testString = "testing";
        boolean test = testString.contains("st");
        System.out.println(test);
        boolean test2 = testString.startsWith("te");
        System.out.println(test2);
        boolean test3 = testString.endsWith("ing");
        System.out.println(test3);


        System.out.println(String.valueOf(5));
        System.out.println(String.format("Here will be %s sdlfkj sdkfjl %s", 1234, "fsg"));

        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println("Ссылки равны ? " + (string1 == string2));
        System.out.println("Объекты равны ? " + (string1.equals(string2)));

        String string3 = new String("abc");
        String string4 = new String("Abc");
        System.out.println("Объекты равны ? " + (string3.equals(string4.toLowerCase())));
        System.out.println("Объекты равны ? " + (string3.equalsIgnoreCase(string4)));

        String a = "        1234534   ";
        String b = a.substring(1, 3);
        System.out.println(a.replaceAll("34", "5555"));
        System.out.println(b);
        System.out.println(a.trim());
//        System.out.println(a == b);






        String email = "unguryan@itstep.org";
        String regular = "[a-zA-Z]{1}[a-zA-Z\\d\\u002E\\u005F]+@ ([a-zA-Z]+\\u002E){1,2}((net)|(com)|(org))";
        System.out.println(email.matches(regular));

        String text = "I love coffee!";
        text = text.replaceAll("[Cc]offee", "Java");


        String s = "Best, Java programming, language.";
        StringTokenizer st = new StringTokenizer(s, "[ ,.]+");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(Arrays.toString(s.split("[ .,]+")));


        Pattern p = Pattern.compile("\\d"); // создает объект

        // образец
        Matcher m1 = p.matcher("fjsdajh, 5  324 dsflkj3. 34 -1"); // создает объект совпадений
        while (m1.find()) {
            // Get the matching string
            String match = m1.group();
            System.out.println(match);
        }

        Pattern p2 = Pattern.compile("[.,]"); // создает объект
        Matcher m2 = p2.matcher("fjsdajh, 5  324 dsflkj3. 34 -1"); // создает объект совпадений
        while (m2.find()) {
            // Get the matching string
            String match = m2.group();
            System.out.println(match);
        }
    }
}
