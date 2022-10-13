package ru.mephi.java.ch06.sec02;

public class Test {
    public static void main(String[] args) {
        StackArrGen<String> stackGeneric = new StackArrGen<>(String.class);

        stackGeneric.push("1");
        stackGeneric.push("2");
        stackGeneric.push("3");

        while (!stackGeneric.isEmpty()) {
            System.out.println(stackGeneric.pop());
        }

        stackGeneric.push("4");
        while (!stackGeneric.isEmpty()) {
            System.out.println(stackGeneric.pop());
        }

        System.out.println();

        StackArrObj<String> stackObj = new StackArrObj<>();

        stackObj.push("1");
        stackObj.push("2");
        stackObj.push("3");

        while (!stackObj.isEmpty()) {
            System.out.println(stackObj.pop());
        }

        stackObj.push("4");
        while (!stackObj.isEmpty()) {
            System.out.println(stackObj.pop());
        }
    }
}
