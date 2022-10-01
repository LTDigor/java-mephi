package ru.mephi.java.ch05.dop;

public class CatchErrorTest {
    public static void main(String[] args) {
        try {
            throw new Error();
        }
        catch (Error e) {
            System.out.println("We can catch errors");
            System.out.println("But we cannot be sure that the application will execute the following code");
        }
    }
}
