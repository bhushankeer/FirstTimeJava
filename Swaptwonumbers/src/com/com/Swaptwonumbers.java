//package com.com;
import java.util.Scanner;

public class Swaptwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1, num2);
    }

    static void swap(int num1, int num2) {
        System.out.println("Before swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

