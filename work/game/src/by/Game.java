package by;


import java.util.Scanner;

public class Game {

    private ChatBot bot;
    private WordManager wordManager;
    private Scanner scanner;

    public Game(ChatBot bot, WordManager wordManager) {
        this.bot = bot;
        this.wordManager = wordManager;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        bot.sayHello();
        wordManager.generateRandomWord();
        while (true) {
            bot.sayInputLetter();
            String letter = scanner.next();
            bot.sayLetterAccepted();

            boolean contains = wordManager.checkLetter(letter.toCharArray()[0]);
            if (contains) {
                bot.sayYes();
                wordManager.openLetter(letter.toCharArray()[0]);
            } else {
                bot.sayNo();
            }
            if(wordManager.checkHasWon()) {
                bot.congrats();
                break;
            }
        }
    }

}
