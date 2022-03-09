package com.sparta.mg.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Mannam";
        Boolean outcome = isPalindrome(word);
        System.out.println(outcome);
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();
        word = word.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) != word.charAt(len - 1 - i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}