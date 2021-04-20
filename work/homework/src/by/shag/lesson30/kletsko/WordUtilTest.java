package by.shag.lesson30.kletsko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilTest {

    @Test
    void testWorldFlip() {
        String s = "Java";
        char[] letters = s.toCharArray();
        char[] reversedLetters = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversedLetters[s.length() - i - 1] = letters[i];
        }
        String reversedS = new String(reversedLetters);
        System.out.println(reversedS);
        assertEquals(reversedS, WordUtil.reverseWord(s));
    }

    @Test
    void textPresenceTest1() {
        String s = "a";

        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Введена одна буква!", exception.getMessage());
        System.out.println(exception);
    }

    @Test
    void textPresenceTest2() {
        String s = " a";

        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Два или более слов! Повторите ввод!", exception.getMessage());
        System.out.println(exception);
    }

    @Test
    void textPresenceTest3() {
        String s = null;

        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Ничего не введено!", exception.getMessage());
        System.out.println(exception);
    }

    @Test
    void textPresenceTest4() {
        String s = "";

        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Пустая строка!", exception.getMessage());
        System.out.println(exception);
    }
}