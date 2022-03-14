package com.sparta.ss.week2.binary_tree;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(6);
        tree.addElement(11);
        tree.addElement(12);
        tree.addElement(13);
        tree.addElement(14);
        tree.addElement(15);
        tree.addElement(16);
        System.out.println(tree.findElement(13));
    }
}
