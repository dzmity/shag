package by.shag.lesson30.gritskevich;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordUtilTest {

    @Test
    void reverseWordHappyPath() {

        assertEquals("avaJ", WordUtil.reverseWord("Java"));

    }

    @Test
    void reverseWordWithStringLengthIsOne() {

        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord("J"));

    }

    @Test
    void reverseWordCheckOnTwoWords() {

        assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord("Java the best"));

    }

    @Test
    void reverseWordChekOnNull() {

        assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(null));

    }

    @Test
    void reverseWordCheckOnEmptyString() {

        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(""));

    }
}