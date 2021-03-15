package by.shag.lesson21;

import java.io.IOException;

public class Person implements Runable {

    @Override
    public void run() {

    }

    @Override
    public void run2() {

    }

    public void throwRuntimeException() throws RuntimeException {
        throw new RuntimeException("prislal govno");
    }


    public void throwException() {
        try {
            makeThomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void makeThomething() throws IOException {
        throw new IOException();
    }
}
