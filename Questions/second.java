package Questions;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int mech = sc.nextInt();

        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is invalid");
        } else if (cse == ece && ece == mech) {
            System.out.println("None of the department has got the highest placement");
        }

        int max = Math.max(cse, Math.max(ece, mech));
        System.out.println("Highest Placement : ");

        if (cse == max)
            System.out.println("CSE");
        if (ece == max)
            System.out.println("ECE");
        if (mech == max)
            System.out.println("MECH");
    }
}
