//package Scanner;
import java.util.*;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factors: ");
        int num = sc.nextInt();
        primeFactors(num);
    }

    static void primeFactors(int num){
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}

