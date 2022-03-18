package com.sparta.ss.week2.generics;

public class GenericFinder {
    private static <T> boolean findInArray(T[] arrayToCheck, T objectToFind) {
        boolean answer = false;
        for (T object : arrayToCheck) {
            if (objectToFind.equals(object)) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"A", "E", "I", "O", "U"};
        Integer[] numbers = {1,2,3,4,5};
        System.out.println(findInArray(words, "A"));
        System.out.println(findInArray(numbers, 1));
    }
}
