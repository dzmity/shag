package by.shag.lesson30.timchuk_dz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilTest {

    @BeforeEach
    void setUp() {
        WordUtil wordUtil = new WordUtil();
    }

    //1.	happyPath
    //2.	если пришла всего 1 буква
    //3.	если в строке оказалось больше 1 слова (если там был пробел)
    //4.	если строка null
    //5.	если пришла пустая строка

    @Test
    void reverseWordTest() { // “Java” -> “avaJ”
        String s = "Java";

        String result = WordUtil.reverseWord(s);
        assertEquals("avaJ", result);
    }

    @Test
    void reverseWordOneLetterTest() {
        String s = "a";

        RuntimeException exception = assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(s));
        assertEquals("В слове только 1 буква", exception.getMessage());
    }

    @Test
    void reverseWordMoreThenOneWordTest() {
        String s = "Java avaJ";

        RuntimeException exception = assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Введено больше 1 слова", exception.getMessage());
    }

    @Test
    void reverseWordNullTest() {
        String s = null;

        RuntimeException exception = assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Не введено слово", exception.getMessage());
    }

    @Test
    void reverseWordEnterVoidWordTest() {
        String s = "";

        RuntimeException exception = assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(s));
        assertEquals("Неправильно введено слово", exception.getMessage());
    }
}