package Questions;

import java.util.Scanner;

public class leftrotate {
    public static String moveString(String str, int k) {
        String ans = str.substring(k) + str.substring(0, k);
        return ans;
        // Example: "hello".substring(2) → "llo"
        // Example: "hello".substring(0,2) → "he"
        // "llo" + "he" → "llohe"
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("Enter the number to move string : ");
        int k = sc.nextInt();
        String rotate = moveString(s, k);

        char[] char1 = s.toCharArray();
        char[] char2 = rotate.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (char1[i] == char2[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
