package by.shag.lesson30.timchuk_dz;

public class WordUtil {

    public static final String S1 = "В слове только 1 буква";
    public static final String S2 = "Введено больше 1 слова";
    public static final String S3 = "Не введено слово";
    public static final String S4 = "Неправильно введено слово";

    public static String reverseWord(String s) {

        if(s == null) {
            throw new IllegalArgumentException(S3);
        }

        if(s.length() == 1) {
           throw new RuntimeException(S1);
        }

        if(s.contains(" ")) {
            throw new IllegalArgumentException(S2);
        }

        if(s.isEmpty()) {
            throw new RuntimeException(S4);
        }


        char[] letters = s.toCharArray();
        char[] reversedLetters = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            reversedLetters[s.length() - i - 1] = letters[i];
        }
        String reversedS = new String(reversedLetters);
        return reversedS; // “Java” -> “avaJ”
    }

//1.	happyPath
//2.	если пришла всего 1 буква
//3.	если в строке оказалось больше 1 слова (если там был пробел)
//4.	если строка null
//5.	если пришла пустая строка


}
