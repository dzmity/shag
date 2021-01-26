package by;

import by.impl.RussianChatBot;
import by.impl.WordManagerImpl;

public class Runner {

    public static void main(String[] args) {
        WordManager manager = new WordManagerImpl("ABC", "ZXC", "ASD", "QEW");
        ChatBot bot = new RussianChatBot();
        Game game = new Game(bot, manager);
        game.start();
    }
}

