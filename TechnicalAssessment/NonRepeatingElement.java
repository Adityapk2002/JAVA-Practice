package TechnicalAssessment;

import java.util.HashMap;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 4, 5, 6, 7, 8, 6 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("Non-repeating element is : ");
        for (int num : arr) {
            if (freq.get(num) == 1) {
                System.out.println(num + " ");
            }
        }
    }
}

// class Main{
// public static int getSingleElement(int arr[]){
// for(int i = 0 ; i < arr.length ; i++){
// int num = arr[i];
// int count = 0;
// for(int j = 0 ; j < arr.length ; j++){
// if(arr[j] == num){
// count++;
// }
// }
// if(count == 1) return num;
// }
// return -1;
// }
// public static void main(String[] args){
// int arr[] = {2,2,1};
// int ans = getSingleElement(arr);
// System.out.println("Single element is : " +ans);
// }
// }