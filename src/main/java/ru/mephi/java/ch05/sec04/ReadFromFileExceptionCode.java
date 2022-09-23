package ru.mephi.java.ch05.sec04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFileExceptionCode {

    //first item is error code
    public static ArrayList<Double> readValues(String filename) {
        ArrayList<Double> result = new ArrayList<>();
        //wrong data
        result.add(-2.0);

        Scanner scanner;
        try {
            scanner = new Scanner(new File(filename));
        }
        catch (FileNotFoundException e) {
            result.set(0, -1.0);
            return result;
        }

        try {
            while (scanner.hasNext()) {
                result.add(Double.parseDouble(scanner.next()));
            }
        }
        catch (NumberFormatException e) {
            return result;
        }

        result.set(0, 0.0);
        return result;
    }

    public static ArrayList<Double> sumOfValues(String filename) {
        ArrayList<Double> res = new ArrayList<>(Arrays.asList(0.0, 0.0));
        ArrayList<Double> doubleArrayList = readValues(filename);

        //all is ok
        if (doubleArrayList.get(0) == -2.0) {
            res.set(0, -2.0);
        }
        else if (doubleArrayList.get(0) == -1.0) {
            res.set(0, -1.0);
        }
        //all is ok
        else {
            for (double val: doubleArrayList) {
                res.set(1, res.get(1) + val);
            }
        }

        return res;
    }
}
