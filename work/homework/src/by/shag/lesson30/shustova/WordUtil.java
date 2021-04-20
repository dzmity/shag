package by.shag.lesson30.shustova;

public class WordUtil {

    public static String reverseWord(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        if (s.length() == 1) {
            throw new RuntimeException();
        }

        if (s.contains(" ")) {
            throw new IllegalArgumentException();
        }

        if (s.isEmpty()) {
            throw new RuntimeException();
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
