package com.sparta.mg.Recursion;

public class RecursionExample {
    public int addRecursively(int max) {
        if (max > 0) {
            System.out.println("hello");
            return max + addRecursively(max - 1);
        } else {
            return 0;
        }
    }

    public void main(String[] args) {
        System.out.println(addRecursively(5));
    }
}
