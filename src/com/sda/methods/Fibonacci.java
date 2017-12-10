package com.sda.methods;

public class Fibonacci {
    public static void main(String[] args) {
        long beforeInvocation = System.currentTimeMillis();

        getFibonacciValue(15);
        long timeAfterInvocation = System.currentTimeMillis();

        System.out.println(timeAfterInvocation - beforeInvocation);
        getFibonacciRecursive(15);

    }

    private static int getFibonacciValue(int whichElement) {
        int first = 0;
        int second = 1;
        int temp;

        for (int i = 2; i < whichElement; i++) {
            temp = second;
            second = second + first;
            first = temp;
        }
        return second;
    }


    private static int getFibonacciRecursive(int whichElement) {
        if (whichElement == 0)
            return 0;
        if (whichElement == 1)
            return 1;

        return getFibonacciRecursive(whichElement - 1)
                + getFibonacciRecursive(whichElement - 2);
    }


}
