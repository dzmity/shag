package by.shag.lesson30.kletsko;

public class WordUtil {

    public static String reverseWord(String s) {

        if(s == null) {
            throw new IllegalArgumentException("Ничего не введено!");
        }

        if(s.length() == 1) {
            throw new RuntimeException("Введена одна буква!");
        }

        if(s.contains(" ")) {
            throw new IllegalArgumentException("Два или более слов! Повторите ввод!");
        }

        if(s.isEmpty()) {
            throw new RuntimeException("Пустая строка!");
        }

        char[] letters = s.toCharArray();
        char[] reversedLetters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversedLetters[s.length() - i - 1] = letters[i];
        }
        String reversedS = new String(reversedLetters);
        return reversedS; // “Java” -> “avaJ”

    }

}
