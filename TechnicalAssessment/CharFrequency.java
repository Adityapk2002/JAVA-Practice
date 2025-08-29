package TechnicalAssessment;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static Map<Character, Integer> calFreq(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        String s = "aditya";
        Map<Character, Integer> ans = calFreq(s);
        System.out.println("The freq of char is : " + ans);
    }
}
