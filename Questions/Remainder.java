package Questions;

import java.util.Scanner;

public class Remainder {
    public static int mod11(String str) {
        int n = str.length();
        int rem = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {
            num = num * 10 + (str.charAt(i) - '0');
            rem = num % 11;
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(mod11(s));
    }
}
