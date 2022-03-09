package com.sparta.mg.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] numbers) {
        int len = numbers.length;
        int a = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    a = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {100,53,43,10,59,60,13,45};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
