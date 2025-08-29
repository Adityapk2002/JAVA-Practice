package TechnicalAssessment;

public class LongestPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = { "madam", "racecar", "hello", "level" };
        String longest = " ";
        for (String s : arr) {
            if (isPalindrome(s) && s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println("The longest Plaindrome is : " + longest);
    }
}
