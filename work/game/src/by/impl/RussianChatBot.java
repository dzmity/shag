package by.impl;

import by.ChatBot;

public class RussianChatBot implements ChatBot {


    @Override
    public void sayHello() {
        System.out.println("Привет, человек.");
        System.out.println("Давай сыграем в игру!");
    }

    @Override
    public void sayInputLetter() {
        System.out.println("Чего ты ждешь? Вводи букву!");
    }

    @Override
    public void sayLetterAccepted() {
        System.out.println("Буква принята");
    }

    @Override
    public void sayYes() {
        System.out.println("Такая буква есть!");
    }

    @Override
    public void sayNo() {
        System.out.println("Ну ты даешь. Конечно нет!");
    }

    @Override
    public void congrats() {
        System.out.println("Да как так-то!?");
        System.out.println("Давай еще раз!");
    }
}
