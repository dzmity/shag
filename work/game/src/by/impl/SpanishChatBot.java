package by.impl;


import by.ChatBot;

public class SpanishChatBot implements ChatBot {

    @Override
    public void sayHello() {
        System.out.println("Олла, человек.");
        System.out.println("Вамос а джугар!");
    }

    @Override
    public void sayInputLetter() {
        System.out.println("ЭЖстос эсперандо?");
    }

    @Override
    public void sayLetterAccepted() {
        System.out.println("Крта ацептада");
    }

    public void sayYes() {
        System.out.println("Летра!");
    }

    @Override
    public void sayNo() {
        System.out.println("Пор супесто но!");
    }

    @Override
    public void congrats() {
        System.out.println("Си де акуна матата!?");
    }
}
