package Questions;

import java.util.*;

public class Theater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int K_CLASS = 75;
        final int Q_CLASS = 150;
        final int REFRESHMENT = 50;

        System.out.print("Enter the no of tickets: ");
        int tickets = sc.nextInt();

        System.out.print("Do you want refreshment (Y/N): ");
        char refresh = sc.next().charAt(0);

        System.out.print("Do you have a coupon code (Y/N): ");
        char coupon = sc.next().charAt(0);

        System.out.print("Enter the ticket type (K/Q): ");
        char type = sc.next().charAt(0);

        int ticketCost = (type == 'K' || type == 'k') ? K_CLASS : Q_CLASS;
        double total = tickets * ticketCost;

        // Refreshment
        if (refresh == 'Y' || refresh == 'y') {
            total += tickets * REFRESHMENT;
        }

        // Apply coupon discount first
        if (coupon == 'Y' || coupon == 'y') {
            total -= total * 0.02;
        }

        // Apply bulk discount last
        if (tickets > 20) {
            total -= total * 0.10;
        }

        System.out.printf("Total cost: %.2f\n", total);
    }
}
