package by.shag.lesson30.litvinov;

import by.shag.lesson30.litvinov.exteption.WrongStringException;

public class WordUtil {

    public static String reverseWord(String s) throws WrongStringException {
        if (s == null) {
            throw new WrongStringException("Line is NULL !!!");
        }

        if (s.length() == 1) {
            throw new WrongStringException("Line is one letter !!!");
        }

        if (s.contains(" ")) {
            throw new WrongStringException("Line contains more then one word !!!");
        }

        if (s.isEmpty()) {
            throw new WrongStringException("Line is empty !!!");
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
