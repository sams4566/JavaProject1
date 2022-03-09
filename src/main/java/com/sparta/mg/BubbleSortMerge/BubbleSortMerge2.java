package com.sparta.mg.BubbleSortMerge;

import java.util.Arrays;

public class BubbleSortMerge2 {
    static int[] bubbleSort(int[] numbers) {
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    swap(numbers, j);
                }
            }
        }
        return numbers;
    }

    private static void swap(int[] numbers, int j) {
        int a;
        a = numbers[j - 1];
        numbers[j - 1] = numbers[j];
        numbers[j] = a;
    }

    static int[] concat(int[] numbers3, int[] numbers4) {
        int array1 = 0;
        int array2 = 0;
        int array3 = 0;
        int length = numbers3.length + numbers4.length;
        System.out.println(length);
        int[] list = new int[length];
        System.out.println(numbers4[1]);
        for (int i = 0; i < length; i++) {
            int x = numbers4[array2];
            int q = numbers3[array1];
            if (x >= q) {
                System.out.println(list[array3]);
                list[array3] = numbers4[array2];
                array2++;
                array3++;
            } else {
                list[array3] = numbers3[array1];
                array1++;
                array3++;
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int[] numbers1 = {100,53,43,10,59,60,13,45};
        int[] numbers2 = {100,53,43,10,59,60,13,45};
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        int[] numbers3 = bubbleSort(numbers1);
        int[] numbers4 = bubbleSort(numbers2);
        int[] numbers = concat(numbers4, numbers3);
        System.out.println(Arrays.toString(numbers));
    }
}
