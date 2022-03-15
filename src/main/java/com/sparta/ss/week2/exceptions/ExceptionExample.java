package com.sparta.ss.week2.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println(arrayChecker(new int[]{1,2,3,4,5}, 8));
        int[] numbers = new int[]{1, 2, 3, 4};
        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You made a mistake!");
        }
    }

    private static int arrayChecker(int[] array, int position) throws ArrayIndexOutOfBoundsException {
        return array[position];
    }
}
