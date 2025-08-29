package TechnicalAssessment;

import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Original String : ");
        String str = sc.nextLine();
        System.out.println("Enter substring to replace : ");
        String oldSub = sc.nextLine();
        System.out.println("Enter new substring : ");
        String newSub = sc.nextLine();

        String result = str.replace(oldSub, newSub);
        System.out.println("Updated String is : " + result);
    }
}
