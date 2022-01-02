package com.empWage;
import java.util.*;

public class Empwages {
    public static void main(String[] args) {
        System.out.println("This is the employee wage builder program.");
        int isFullTIme = 1;
        int isPartTime = 2;
        int fullTimeRatePerHr = 20;
        int empHrs = 0;
        int empWage = 0;
        Random random = new Random();
        int empCheck = random.nextInt(3);
        if(empCheck == isFullTIme){
            empHrs = 8;
            System.out.println("Employee is present.");
        }
        else if(empCheck == isPartTime){
            empHrs = 4;
            System.out.println("Employee works part time.");
        }
        else{
            empHrs = 0;
            System.out.println("Employee is absent.");
        }
        empWage = empHrs * fullTimeRatePerHr;
        System.out.println("Employee rate per day: " + empWage);
    }
}