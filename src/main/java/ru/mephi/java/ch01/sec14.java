package ru.mephi.java.ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class sec14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //fill the array
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        String str = in.nextLine();
        while (!"".equals(str)) {
            String[] rowStringArr = str.split(" ");
            ArrayList<Integer> rowIntArr = new ArrayList<>();
            for (String item: rowStringArr) {
                rowIntArr.add(Integer.parseInt(item));
            }
            data.add(rowIntArr);

            str = in.nextLine();
        }

        //find the answer
        boolean isMagicSquare = true;

        int squareSize = sizeSquareArr(data);
        if (squareSize < 1)
            isMagicSquare = false;

        //find the sum of the first row
        int sum = getRowSum(squareSize, data.get(0));

        //checking rows sum
        for (int row = 0; row < squareSize && isMagicSquare; row++) {
            if (sum != getRowSum(squareSize, data.get(row))) {
                isMagicSquare = false;
            }
        }

        //checking columns sum
        for (int column = 0; column < squareSize && isMagicSquare; column++) {
            if (sum != getColumnSum(squareSize, data, column))
                isMagicSquare = false;
        }

        //checking diagonals
        int sumMainDiagonal = 0;
        int sumSideDiagonal = 0;
        for (int i = 0; i < squareSize && isMagicSquare; i++) {
            sumMainDiagonal += data.get(i).get(i);
            sumSideDiagonal += data.get(i).get(squareSize - i - 1);
        }
        if (sum != sumMainDiagonal && sum != sumSideDiagonal)
            isMagicSquare = false;

        System.out.println(isMagicSquare);
    }

    private static int sizeSquareArr(ArrayList<ArrayList<Integer>> data) {
        final int ROWS_NUMBER = data.size();

        //check rows len
        for (int i = 0; i < data.size(); i++)
            if (data.get(i).size() != ROWS_NUMBER)
                return  -1;

        return ROWS_NUMBER;
    }

    private static int getColumnSum(int squareSize, ArrayList<ArrayList<Integer>> square, int column) {
        int columnSum = 0;
        for (int row = 0; row < squareSize; row++) {
            columnSum += square.get(row).get(column);
        }
        return columnSum;
    }

    private static int getRowSum(int squareSize, ArrayList<Integer> square) {
        int rowSum = 0;
        for (int column = 0; column < squareSize; column++) {
            rowSum += square.get(column);
        }

        return rowSum;
    }
}
