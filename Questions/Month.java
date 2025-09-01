package Questions;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month = sc.nextInt();
        String season;
        if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn";
        } else if (month >= 12 && month == 1 || month == 2) {
            season = "Winter";
        } else {
            season = "Invalid month";
        }
        System.out.println(season);
        sc.close();
    }
}
