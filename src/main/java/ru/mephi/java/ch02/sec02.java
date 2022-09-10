package ru.mephi.java.ch02;

import java.util.Random;
import java.util.Scanner;

public class sec02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Mutable because of useTypeCache();
        System.out.print("Enter the number: ");
        System.out.println("Your number is: " + in.nextInt());

        //Accessor
        Random generator = new Random();
        System.out.println("Random number: " + generator.nextInt());


    }
}
