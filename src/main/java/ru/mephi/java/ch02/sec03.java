package ru.mephi.java.ch02;

import java.util.ArrayList;

public class sec03 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        //Mutator and return boolean
        myList.add(1);

        MyClass myClass = new MyClass();
        //accessor and return void
        myClass.printHello();
    }

    public static class MyClass {
        int x;
        public void printHello() {
            System.out.println("Hello");
        }
        {
            x = 0;
        }
    }
}
