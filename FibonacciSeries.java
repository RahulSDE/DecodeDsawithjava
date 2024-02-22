package LoopAssignment;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the terms: ");
        int term = input.nextInt();

        int s1 = 0;
        int s2 = 1;
        System.out.print(s1+" ");
        System.out.print(s2+" ");
        int s3;
        for(int i = 1;i<=term-2;i++){
            s3 = s1 + s2;
            System.out.print(s3 + " ");
            s1 = s2;
            s2 = s3;
        }

    }
}
