package ru.mephi.java.ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class sec15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rowsValue = in.nextInt();

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        fillTriangle(triangle, rowsValue);
        printTriangle(triangle);
    }

    private static void printTriangle(ArrayList<ArrayList<Integer>> triangle) {
        final int size = triangle.size();
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d| ", i + 1);

            for (int j = 0; j < size - i - 1; j++)
                System.out.print("  ");

            for (int j = 0; j < i + 1; j++ )
                System.out.printf("%2d  ", triangle.get(i).get(j));

            System.out.println();
        }
    }

    private static void fillTriangle(ArrayList<ArrayList<Integer>> triangle, int rowsValue) {
        triangle.clear();

        for (int i = 0; i < rowsValue; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }

            if (i != 0) row.add(1);
            triangle.add(row);
        }
    }
}
