package ru.mephi.java.ch06.sec04;

public class KeyNotFoundException extends Exception{
    public KeyNotFoundException() {
        super();
    }

    public KeyNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
