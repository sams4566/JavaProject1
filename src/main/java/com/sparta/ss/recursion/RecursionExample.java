package com.sparta.ss.recursion;

public class RecursionExample {
    public int addRecursively(int max) {
        if (max > 0) {
            return max + addRecursively(max - 1);
        } else {
            return 0;
        }
    }

    public void main(String[] args) {
        System.out.println(addRecursively(5));
    }
}
