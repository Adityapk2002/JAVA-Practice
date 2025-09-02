package Questions;

import java.util.Scanner;

public class MinimumDiscountProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        sc.nextLine();

        String minProduct = " ";
        double minDiscount = Double.MAX_VALUE;

        for (int i = 0; i < items; i++) {
            String line = sc.nextLine();
            String parts[] = line.split(" ");
            String name = parts[0];
            double price = Double.parseDouble(parts[1]);
            double discountPercent = Double.parseDouble(parts[2]);

            double discountedAmount = (price * discountPercent) / 100;

            if (discountedAmount < minDiscount) {
                minDiscount = discountedAmount;
                minProduct = name;
            }
        }
        System.out.println(minProduct);
        sc.close();
    }
}