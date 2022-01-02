//package com;

import java.util.*;

public class poewroftwo {
    public static void main(String[] args) {
        printTable();
    }

    static void printTable(){
        for (int i = 0; i < 3; i++) {
            System.out.println(2 + " ^ " + i + "= " + Math.pow(2, i));
        }
    }
}

