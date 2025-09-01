package Questions;

import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter the performance appraisal rating : ");
        double appraisal = sc.nextDouble();
        if (salary < 0 || appraisal < 0) {
            System.out.println("Invalid input");
        }

        if (appraisal >= 1 && appraisal <= 3) {
            salary += salary * 0.10;
        } else if (appraisal >= 3.1 && appraisal <= 4) {
            salary += salary * 0.25;
        } else if (appraisal >= 4.1 && appraisal <= 5) {
            salary += salary * 0.30;
        }
        System.out.println("Salary is : " + salary);
    }
}
