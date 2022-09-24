package ru.mephi.java.ch05.sec10;

public class Factorial {
    public static int factorial(int n) throws RuntimeException {
//        int res =  n == 1 ? 1 : n * factorial(n - 1);
//
//        RuntimeException e = new RuntimeException(Integer.toString(res));
//        e.printStackTrace();
//
//        return res;

        if (n == 1)
            throw new RuntimeException("1");

        int res;
        try {
            res = n * factorial(n - 1);
        }
        catch (RuntimeException e) {
            throw new RuntimeException(Integer.toString(Integer.parseInt(e.getMessage()) * n), e);
        }

        return res;
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
