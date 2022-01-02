import java.util.*;

public class Harmonicnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        double harmonic = harmonicNumber(num);
        System.out.println("Harmonic number till range " + num + " is: " + harmonic);
        sc.close();
    }

    static double harmonicNumber(int num){
        double harmonic = 0;
        for (double i = 1; i <= num; i++) {
            harmonic += (1 / i);
            System.out.println(harmonic);
        }
        return harmonic;
    }
}

