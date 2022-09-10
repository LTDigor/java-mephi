package ru.mephi.java.ch03.sec08;

public class Test {
    public static void main(String[] args) {
        Greeter bob = new Greeter(500, "Alice");
        Greeter alice = new Greeter(500, "Bob");

        Thread thread1 = new Thread(bob);
        Thread thread2 = new Thread(alice);

        thread1.start();
        thread2.start();

    }
}
