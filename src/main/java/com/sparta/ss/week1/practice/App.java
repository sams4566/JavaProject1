package com.sparta.ss.week1.practice;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int grade = 0;
        while(grade < 10) { // waiting for a condition
            System.out.println(grade);
            grade = grade + 1; // grade++
        }

        for (int i = 0; i < 10; i++) { // how many times
            System.out.println(grade);
        }

        boolean answer = (grade < 0) ? true:false;

        int[] numbers = {1, 2, 3, 4 ,5, 6}; // primitive array
        int[] moreNumbers = new int[10];
        System.out.println(numbers[0]);
        numbers[0] = 100;
        System.out.println(moreNumbers[5]);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(moreNumbers));

        // Test Scanner class
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        String[] list1 = new String[3];
        list1[0] = scanned;
        System.out.println(Arrays.toString(list1));
    }
}
