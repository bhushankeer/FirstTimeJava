//package com;
import java.util.*;

public class CoinFlip {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to flip the coin: ");
    int numOfFlips = sc.nextInt();
    countHeadsOrTails(numOfFlips);
}

    static void countHeadsOrTails(int numOfFlips){
        int totalFlips = 0;
        int headsCount = 0;
        int tailsCount = 0;
        while (totalFlips != numOfFlips){
            Random flip = new Random();
            int coinFace = flip.nextInt(2);
            switch(coinFace){
                case 0 -> {
                    totalFlips += 1;
                    tailsCount += 1;
                }
                case 1 -> {
                    totalFlips += 1;
                    headsCount += 1;
                }
            }
        }
        System.out.println("The coin was flipped " + totalFlips + "number of times.");
        System.out.println("The coin landed with Heads face up " + headsCount + " number of times.");
        System.out.println("The coin landed with Tails face up " + tailsCount + " number of times.");
        headsOrTailsPercentage(totalFlips, headsCount, tailsCount);
    }

    static void headsOrTailsPercentage(int totalFlips, int headsCount, int tailsCount){
        int headsPercentage = (headsCount / totalFlips) * 100;
        int tailsPercentage = (tailsCount / totalFlips) * 100;
        System.out.println("Heads Percentage: " + headsPercentage + "%");
        System.out.println("Tails Percentage: " + tailsPercentage + "%");
    }
}

