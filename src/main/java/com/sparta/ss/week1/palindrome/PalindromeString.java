package com.sparta.ss.week1.palindrome;

public class PalindromeString {
    public static void main(String[] args) {
        String words = new String("redivider deified radar level hello goodbye");
        if (longestPalin(words) == "")
            System.out.println("No Palindrome");
        else
            System.out.println(longestPalin(words));
    }

    static String longestPalin(String words) {
        String specificword = "";
        String longestword = "";
        int maxlength = 0;
        String[] wordlist = words.split(" ");
        for (int j = 0; j < wordlist.length; j++) {
            int length = wordlist[j].length();
            specificword = wordlist[j];
            if (isPalindrome(specificword) && length > maxlength) {
                longestword = specificword;
                maxlength = length;
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
