package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FIndLeaders {
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        if (arr == null || arr.length == 0)
            return leaders;
        int n = arr.length;
        int maxRight = arr[n - 1]; // the rightmost is always a leader
        // An element is called a leader if no element to its right is greater than it.
        leaders.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        List<Integer> ans = findLeaders(arr);
        System.out.println(ans);
    }
}
