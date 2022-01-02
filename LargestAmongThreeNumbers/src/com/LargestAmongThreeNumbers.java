//package com;


public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the largest of them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        findLargest(num1, num2, num3);
    }

    static void findLargest(int num1, int num2, int num3){
        int max = num1;
        if(num2 > max && num2 > num3)
            max = num2;
        else if(num3 > max && num3 > num2)
            max = num3;
        System.out.println("The largest number is: " + max);
    }
}
}
