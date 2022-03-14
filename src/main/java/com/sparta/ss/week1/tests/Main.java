package com.sparta.ss.week1.tests;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        // Using Java API methods
        // Testing
        // Optimised to run on the JVM
        System.out.println(new StringBuilder(word).reverse().toString().equals(word));
        System.out.println(new StringBuffer(word).reverse().toString().equals(word));
        // Arrays.sort();
        String [] split = "racecar".split("");
        System.out.println(Arrays.toString(split));
        int[] numbers = new int[6];
        numbers[2] = 5;
        System.out.println(Arrays.toString(numbers));
    }
}
