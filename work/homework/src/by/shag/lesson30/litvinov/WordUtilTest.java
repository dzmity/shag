package by.shag.lesson30.litvinov;

import by.shag.lesson30.litvinov.exteption.WrongStringException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilTest {

    @Test
    void reverseWordHappyPath() throws WrongStringException {
        String str = "Java";
        String result = WordUtil.reverseWord(str);
        assertEquals("avaJ", result);
    }

    @Test
    void reverseWordOneLetter() {
        String str = "J";
        assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
    }

    @Test
    void reverseWordOneLetterMessage() {
        String str = "J";
        WrongStringException exception = assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
        assertEquals("Line is one letter !!!", exception.getMessage());
    }

    @Test
    void reverseWordMoreThanOneWord() {
        String  str = "Java ";
        assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
    }

    @Test
    void reverseWordMoreThanOneWordMessage() {
        String  str = "Java ";
        WrongStringException exception = assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
        assertEquals("Line contains more then one word !!!", exception.getMessage());
    }

    @Test
    void reverseWordLineNull() {
        String str = null;
        assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
    }

    @Test
    void reverseWordLineNullMessage() {
        String str = null;
        WrongStringException exception = assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
        assertEquals("Line is NULL !!!", exception.getMessage());
    }

    @Test
    void reverseWordLineEmpty() {
        String str = "";
        assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
    }

    @Test
    void reverseWordLineEmptyMessage() {
        String str = "";
        WrongStringException exception = assertThrows(WrongStringException.class, () -> WordUtil.reverseWord(str));
        assertEquals("Line is empty !!!", exception.getMessage());
    }
}