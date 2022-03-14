package com.sparta.ss.week2.design_patterns.singleton;

// Default constructor - no parameters
public class SingletonExample {
    private static final SingletonExample singleton = new SingletonExample();

    private SingletonExample() {}

    public static SingletonExample getSingleton() {
        return singleton;
    }

    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getSingleton();
        SingletonExample s2 = SingletonExample.getSingleton();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
