package com.sparta.ss.week2.randomscanner;

import java.util.Random;
import java.util.Scanner;

public class RandomScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Console input
        System.out.println("Enter your name: ");
        String name = scanner.next(); // Type that it's collecting - memory
        System.out.println("Hello " + name);
        scanner.close(); // Must close scanner when done

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            System.out.println(random.nextInt(10) + 1);
        }
    }
}
