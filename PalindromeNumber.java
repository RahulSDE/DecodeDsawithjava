package LoopAssignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = n;

        int reverseNo = 0;
        int rem;
        while(n != 0){
            rem = n % 10;
            reverseNo = reverseNo * 10 + rem;
            n = n / 10;
        }

        if(n2 == reverseNo) System.out.println("palindrome no : ");
        else System.out.println("Not a palindrome no: ");
    }
}
