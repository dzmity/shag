package by.impl;

import by.WordManager;

public class WordManagerImpl extends WordManager {

    public WordManagerImpl(String ... words) {
        this.words = words;
    }

    public String generateRandomWord() {
        int index = (int) (Math.random() * words.length);
        chosenWord = words[index].toUpperCase();

        hiddenWord = "";
        for (int i = 0; i < chosenWord.length(); i++) {
            hiddenWord += "_";
        }
        return hiddenWord;
    }

    public boolean checkLetter(char let) {
        return chosenWord.indexOf(let) != -1 && hiddenWord.indexOf(let) == -1;
    }

    public String openLetter(char let) {
        char[] originalLetters = chosenWord.toCharArray();
        // "JAVA" => ['J', 'A', 'V', 'A']
        for (int i = 0; i < originalLetters.length; i++) {
            char original = originalLetters[i];
            if (original == let) {
                // "J _ V _" => ['J', '_', 'V', '_']
                char[] hiddenLetters = hiddenWord.toCharArray();
                hiddenLetters[i] = let;
                // ['J', '_', 'V', '_'] = > "J _ V _"
                hiddenWord = String.valueOf(hiddenLetters);
            }
        }
        return hiddenWord;
    }

    public boolean checkHasWon() {
        if (chosenWord.equals(hiddenWord)) {
            return true;
        } else {
            return false;
        }
    }
}
