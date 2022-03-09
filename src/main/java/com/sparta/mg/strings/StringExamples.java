package com.sparta.mg.strings;

public class StringExamples {
    public static void main(String[] args) {
//        //Primitive & Object Types
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = "Hello World";
        String s4 = new String("Hello World");
        String s5 = new String("Hello World");

//        System.out.println(s1.equals(s5));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());

        s4 = s4.intern();

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));

    }

//    public static boolean isPalindrome(string word)
}
