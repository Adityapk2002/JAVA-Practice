package Questions;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Input A : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Input B : ");
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Error: First number should be less than second number.");
        } else {
            System.out.println("Prime numbers between " + a + " and " + b + " are:");
        }

        for (int i = a; i < b; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % 2 == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}
