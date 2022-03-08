package com.sparta.mg.BubbleSortMerge;

import java.util.Arrays;

public class BubbleSortMerge {
    static void bubbleSort(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    swap(numbers, j);
                }
            }
        }
    }

    private static void swap(int[] numbers, int j) {
        int a;
        a = numbers[j - 1];
        numbers[j - 1] = numbers[j];
        numbers[j] = a;
    }

    static int[] concat(int[] numbers1, int[] numbers2) {
        int length = numbers1.length + numbers2.length;
        int[] result = new int[length];

        int position = 0;
        for (int element : numbers1) {
            result[position] = element;
            position++;
        }

        for (int element : numbers2) {
            result[position] = element;
            position++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers1 = {100,53,43,10,59,60,13,45};
        int[] numbers2 = {100,53,43,10,59,60,13,45};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        int[] numbers = concat(numbers1, numbers2);
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
