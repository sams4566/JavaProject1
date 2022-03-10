package com.sparta.ss.strings;

public class StringExamples2 {
    public static void main(String[] args) {
        String postcode = "EC2Y 5AS";
        String name = "Manish";
        for (char letter : name.toCharArray()) {
            System.out.println(letter);
        }
        System.out.println(name.matches(".{6}"));
        System.out.println(postcode.matches("[A-Z]?[A-Z][0-9][A-Z] [0-9][A-Z][A-Z]"));
    }
}
