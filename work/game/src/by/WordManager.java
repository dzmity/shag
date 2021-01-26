package by;

public abstract class WordManager {

    protected String[] words;
    protected String chosenWord;
    protected String hiddenWord;

    public abstract String generateRandomWord();

    public abstract boolean checkLetter(char letter);

    public abstract String openLetter(char letter);

    public abstract boolean checkHasWon();
}
