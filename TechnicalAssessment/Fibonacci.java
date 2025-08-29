package TechnicalAssessment;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("The Fibonacci series of " + n + " is");
        for (int i = 1; i <= n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
