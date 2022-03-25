package com.sparta.ss.week3.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadDriver {
    public static void main(String[] args) {
//        List<String> myList = new Vector<String>();
        List<String> myList = new ArrayList<String>();
        MyDemo demo1 = new MyDemo(myList, "Ryan");
        MyDemo demo2 = new MyDemo(myList, "Sam");
        Thread t1 = new Thread(demo1);
        Thread t2 = new Thread(demo2);

        System.out.println("Just about to start");
//        demo1.start(); - extends Thread
//        demo2.start(); - extends Thread
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The ArrayList has " + myList.size() + " elements");
        System.out.println("Finishing");
    }
}
