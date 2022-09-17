package ru.mephi.java.ch04.dop;

public class TestCyclic {
    public static void main(String[] args) throws IllegalAccessException {
        A a1 = new A();
        A a2 = new A();

        B b1 = new B(a1, "1");
        B b2 = new B(a2, "1");
        B b3 = new B();

        a1.b = b3;
        a2.b = b3;

        System.out.println(IsEquals.isEquals(b1, b2));
    }
}
