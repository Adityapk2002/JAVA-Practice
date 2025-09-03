package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of days");
        int n = sc.nextInt();
        System.out.println("Enter the changes in stock");
        int[] changes = new int[n];
        for (int i = 0; i < n; i++) {
            changes[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(changes));
        long price = 0;
        long bestTimeBuy = 0;
        for (int i = 0; i < n; i++) {
            price += changes[i];
            bestTimeBuy = Math.min(bestTimeBuy, price);
        }
        System.out.println("The minPrice is : " + bestTimeBuy);
    }
}
