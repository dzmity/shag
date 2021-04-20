package by.shag.lesson30.shustova;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static by.shag.lesson30.shustova.WordUtil.reverseWord;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordUtilTest {

    @BeforeEach
    void setUp() {
        new WordUtil();
    }

    @Test
    void testHappyPathReverseWord() {
        String validString = "Java_";
        String expectedResult = "_avaJ";

        String result = reverseWord(validString);
        assertEquals(expectedResult, result);
    }

    @Test
    void testOneCharInReverseWord() {
        String validString = "J";

        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> reverseWord(validString));
    }

    @Test
    void testSpaceInReverseWord() {
        String validString = "J a";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> reverseWord(validString));
    }

    @Test
    void testIsNullInReverseWord() {
        String validString = null;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> reverseWord(validString));
    }

    @Test
    void testIsEmptyInReverseWord() {
        String validString = "";

        RuntimeException exception = assertThrows(RuntimeException.class,
                () -> reverseWord(validString));
    }
}