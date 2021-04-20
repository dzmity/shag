package by.shag.lesson30.golatina;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordUtilTest {

    private static WordUtil wordUtil;

    @BeforeAll
    static void beforeAll() {
        wordUtil = new WordUtil();
    }

    @Test
    void goodFinalGetStringReverse() {
        String forReverse = "Java";
        assertEquals("avaJ", wordUtil.reverseWord(forReverse));
    }

    @Test
    void whenStringContainsOnlyOneLetter() {
        String forReverse = "J";

        assertThrows(RuntimeException.class, () ->wordUtil.reverseWord(forReverse));
        assertEquals("В строке только один символ", assertThrows(RuntimeException.class, () -> wordUtil.reverseWord(forReverse)).getMessage());
    }

    @Test
    void whenStringContainsMoreOneLetterOrSpace() {
        String forReverse = "Java Java";

        Exception exception = assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(forReverse));
        assertEquals("Строка содержит пробел", exception.getMessage());
    }

    @Test
    void whenStringIsNull() {
        String forReverse = null;

        assertThrows(RuntimeException.class, () ->wordUtil.reverseWord(forReverse));
        assertEquals("Строка null", assertThrows(IllegalArgumentException.class, () -> wordUtil.reverseWord(forReverse)).getMessage());
    }

    @Test
    void whenStringIsEmpty() {
        String forReverse = "";

        assertThrows(RuntimeException.class, () ->wordUtil.reverseWord(forReverse));
        assertEquals("Пустая строка", assertThrows(RuntimeException.class, () -> wordUtil.reverseWord(forReverse)).getMessage());
    }

}