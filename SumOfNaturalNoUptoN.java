package LoopAssignment;
import java.util.*;
public class SumOfNaturalNoUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer : ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.print(i + " ");
        }
    }
}
