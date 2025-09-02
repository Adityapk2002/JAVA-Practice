package Questions;

import java.util.Scanner;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxRight = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(maxRight, temp);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i < n - 1 ? " " : ""));
        }
    }
}
// 6
// 16 17 4 3 5 2
