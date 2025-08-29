package TechnicalAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the first string : ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}

// class Solution {
// public boolean isAnagram(String s, String t) {
// if(s.length() != t.length()) return false;

// int[] count = new int[26];

// for(int i = 0 ; i < s.length() ; i++){
// count[s.charAt(i) - 'a']++;
// count[t.charAt(i) - 'a']--;
// }

// for(int c : count){
// if(c != 0) return false;
// }
// return true;
// }
// }
