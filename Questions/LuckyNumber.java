package Questions;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4-digit number : ");
        int num = sc.nextInt();

        if (num < 1000 || num > 9999 || num < 0 || num == 0) {
            System.out.println("Invalid Input");
        } else {

            int sum = 0;
            int temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                System.out.println("Lucky Number");
            } else {
                System.out.println("Sorry its not my lucky number");
            }
        }
    }
}
