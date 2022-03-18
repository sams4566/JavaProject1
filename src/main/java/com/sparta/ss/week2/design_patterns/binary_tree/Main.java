package com.sparta.ss.week2.design_patterns.binary_tree;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(6);
        tree.addElement(11);
        tree.addElement(12);
        tree.addElement(12);
        tree.addElement(14);
        tree.addElement(15);
        tree.addElement(16);
        System.out.println(tree.findElement(12));
    }
}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int scanned = sc.nextInt();
//        BinaryTree tree = new BinaryTree(scanned);
//        Random random = new Random();
//        for (int i = 0; i < scanned; i++) {
//            int rand = random.nextInt(4);
//            tree.addElement(rand);
//        }
//        System.out.println(tree.findElement(3));
//    }
//}
