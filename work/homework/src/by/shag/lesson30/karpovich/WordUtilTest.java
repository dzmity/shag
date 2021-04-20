package by.shag.lesson30.karpovich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

class WordUtilTest {

    private WordUtil wordUtil;

    @BeforeEach
    void setUp() {
        wordUtil = new WordUtil();
    }

    @Test
    void happyPath() {
        String validArgument = "Java";
        String arg = "avaJ";
        String arg1 = WordUtil.reverseWord(validArgument);
        assertEquals(arg1, arg);
    }

    @Test
    void haveOneLetter() {
        String validArgument = "s";
        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(validArgument));
    }

    @Test
    void haveSpace() {
        String validArgument = "s" + " " + "a";
        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(validArgument));
    }

    @Test
    void testStringNull() {
        String validArgument = null;
        assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(validArgument));
    }

    @Test
    void testEmptyLine() {
        String validArgument = "";
        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(validArgument));
    }
}