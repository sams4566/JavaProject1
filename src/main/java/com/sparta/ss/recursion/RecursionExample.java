package com.sparta.ss.recursion;

public class RecursionExample {
    public static int addRecursively(int max) {
        if (max > 0) {
            return max + addRecursively(max - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(addRecursively(5));
    }
}
