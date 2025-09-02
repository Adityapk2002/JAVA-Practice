package Questions;

import java.util.Stack;

// public class Movehash {
//     public static String moveHashAtEnd(String str) {
//         Stack<Character> withHash = new Stack<>();
//         Stack<Character> withOutHash = new Stack<>();

//         for (char ch : str.toCharArray()) {
//             if (ch == '#') {
//                 withHash.push(ch);
//             } else {
//                 withOutHash.push(ch);
//             }
//         }

//         StringBuilder result = new StringBuilder();

//         while (!withHash.isEmpty()) {
//             result.append(withHash.pop());
//         }

//         Stack<Character> temp = new Stack<>();
//         while (!withOutHash.isEmpty()) {
//             temp.push(withOutHash.pop());
//         }
//         while (!temp.isEmpty()) {
//             result.append(temp.pop());
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String s = "Move#Hash#to#Front";
//         String ans = moveHashAtEnd(s);
//         System.out.println(ans);
//     }
// }

public class Movehash {
    public static String moveHashAtEnd(String str) {
        StringBuilder result = new StringBuilder();
        int hashCount = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '#')
                hashCount++;
            else
                result.append(ch);
        }
        return "#".repeat(hashCount) + result.toString();
    }

    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        String ans = moveHashAtEnd(s);
        System.out.println(ans);
    }
}
