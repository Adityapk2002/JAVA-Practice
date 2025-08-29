package TechnicalAssessment;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceByRank {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], i + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        System.out.println("Array with ranks : " + Arrays.toString(arr));
    }
}
