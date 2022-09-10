package ru.mephi.java.ch01;

import java.util.Scanner;

public class sec08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        int len = str.length();

        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len + 1; j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
