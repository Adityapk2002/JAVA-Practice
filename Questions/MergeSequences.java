package Questions;

import java.util.Scanner;

public class MergeSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String A = sc.next();
        int b = sc.nextInt();
        String B = sc.next();

        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();

        while (i < a && j < b) {
            result.append(A.charAt(i));
            result.append(B.charAt(j));
            i++;
            j++;
        }
        while (i < a) {
            result.append(A.charAt(i));
            i++;
        }
        while (j < b) {
            result.append(B.charAt(j));
            i++;
        }
        System.out.println(result.toString());
        sc.close();
    }
}
