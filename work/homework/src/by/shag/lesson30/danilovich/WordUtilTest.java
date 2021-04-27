package by.shag.lesson30.danilovich;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordUtilTest {

    @Test
    void word() {
        String word = "Дмитрий";
        String endWord = "йиртимД";

        String result = WordUtil.reverseWord(word);
        assertEquals(endWord, result);
    }

    @Test
    void oneCharWord() {
        String word = "Д";

        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(word));
    }

    @Test
    void notOneWord() {
        String word = "Дима Данилович";

        assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(word));
    }

    @Test
    void notNullWord() {
        String word = null;

        assertThrows(IllegalArgumentException.class, () -> WordUtil.reverseWord(word));
    }

    @Test
    void notWord() {
        String word = "";

        assertThrows(RuntimeException.class, () -> WordUtil.reverseWord(word));
    }
}