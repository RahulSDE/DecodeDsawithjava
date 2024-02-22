package LoopAssignment;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        int gcd = 1;
        for(int i = 2;i<=min;i++){
            if((max % i == 0) && (min % i == 0)) gcd = i;
        }

        System.out.println("The gcd of " + n1 + " and " + n2 + " is "+gcd);

    }
}
