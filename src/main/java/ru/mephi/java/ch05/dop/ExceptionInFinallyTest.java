package ru.mephi.java.ch05.dop;

public class ExceptionInFinallyTest {

    public static void main(String[] args) {
        try {
            System.out.println("1 / 0");
            int a = 1 / 0;
        }
        catch (ArithmeticException e) {
            throw new RuntimeException("Catch exception", e);
        }
        finally {
            //we can't see exception from catch-block
            throw new RuntimeException("Finally block");
        }
    }
}
