package Questions;

import java.util.Scanner;

public class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no if semester : ");
        int semNum = sc.nextInt();

        for (int sem = 1; sem <= semNum; sem++) {
            System.out.println("Enter no of subjects in " + sem + " semester : ");
            int subjects = sc.nextInt();

            int[] marks = new int[subjects];
            System.out.println("Marks obtained in semester " + sem + " :");

            for (int i = 0; i < subjects; i++) {
                marks[i] = sc.nextInt();
            }
            int MaxMark = findMaxMark(marks);
            System.out.println("Maximum mark in " + sem + " semester : " + MaxMark);
        }

    }

    private static int findMaxMark(int[] marks) {
        int max = -1;
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                System.out.println("Invalid marks");
                System.exit(0);
            }
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }
}
