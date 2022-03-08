package com.sparta.mg.Palindrome;

public class PalindromeString {
    public static void main(String[] args) {
        String words = new String("My ama is Manam");
        if (longestPalin(words) == "")
            System.out.println("No Palindrome");
        else
            System.out.println(longestPalin(words));
            System.out.println(longestPalin(words));
        Boolean outcome = isPalindrome(words);
        System.out.println(outcome);
        System.out.println(outcome);
    }

    static String longestPalin(String words) {
        words = words + " ";
        String specificword = "";
        String longestword = "";
        int length = 0;
        int maxlength = 0;
        for (int i = 0; i < words.length(); i++) {
            char letter = words.charAt(i);
            if (letter != ' ') {
                specificword = specificword + letter;
            } else {
                length = specificword.length();
                if (isPalindrome(specificword) && length > maxlength) {
                    longestword = specificword;
                    maxlength = length;
                }
                specificword = "";
            }
        }
        return longestword;
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
