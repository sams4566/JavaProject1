package com.sparta.ss.fibonacci;

public class FibonacciSequence {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 0; i < number; i++) {
            System.out.println(fibonacciSequence(i));
        }
    }

    private static int fibonacciSequence(int position) {
        if (position == 1 || position == 2) {
            return 1;
        }
        if (position == 0) {
            return 0;
        }
        return fibonacciSequence(position - 2) + fibonacciSequence(position - 1);
    }
}
