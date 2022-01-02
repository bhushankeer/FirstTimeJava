//package com;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not: ");
        int year = sc.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is a leap year!");
        }
        else{
            System.out.println(year + " is not a leap year!");
        }
    }

    static boolean checkLeapYear(int year){
        boolean isLeapYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                isLeapYear = year % 400 == 0;
            }
            isLeapYear = true;
        }
        else{
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
