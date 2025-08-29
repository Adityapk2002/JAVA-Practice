package TechnicalAssessment;

import java.util.Scanner;

// public class Palindrome {
//     public static boolean isPalindrome(String S) {
//         int left = 0;
//         int right = S.length() - 1;
//         while (left < right) {
//             if (S.charAt(left) != S.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "madam";
//         boolean ans = isPalindrome(s);
//         System.out.println("The String is palindrome : " + ans);
//     }
// }

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        boolean isPalindrome = true;
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }
}