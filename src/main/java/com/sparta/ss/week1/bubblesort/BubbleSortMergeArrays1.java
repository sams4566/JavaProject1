package com.sparta.ss.week1.bubblesort;

import java.util.Arrays;

public class BubbleSortMergeArrays1 {
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
        int a = 0;
        a = numbers[j - 1];
        numbers[j - 1] = numbers[j];
        numbers[j] = a;
    }

    static int[] concat(int[] numbers3, int[] numbers4) {
        int array1 = 0;
        int array2 = 0;
        int array3 = 0;
        int length1 = numbers3.length;
        int length2 = numbers4.length;
        int lengthlist = numbers3.length + numbers4.length;
        int[] list = new int[lengthlist];
        while (array3 < lengthlist) {
            if (array1 == length1) {
                list[array3] = numbers4[array2];
                System.out.println(array1);
                array2++;
                array3++;
            } else if (array2 == length2) {
                list[array3] = numbers3[array1];
                array1++;
                array3++;
            } else {
                if (numbers3[array1] < numbers4[array2]) {
                    list[array3] = numbers3[array1];
                    array1++;
                    array3++;
                } else if (numbers3[array1] == numbers4[array2]) {
                    list[array3] = numbers3[array1];
                    array1++;
                    array3++;
                    list[array3] = numbers4[array2];
                    array2++;
                    array3++;
                } else {
                    list[array3] = numbers4[array2];
                    array2++;
                    array3++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] numbers1 = {700,89,98,100,119,192};
        int[] numbers2 = {10,29,30,49,5,68};
        int[] numbers3 = bubbleSort(numbers1);
        int[] numbers4 = bubbleSort(numbers2);
        int[] numbers = concat(numbers3, numbers4);
        System.out.println(Arrays.toString(numbers));
    }
}
