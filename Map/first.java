package Map;

import java.util.HashMap;
import java.util.Map;

public class first {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Yash");
        students.put(102, "Parth");
        students.put(103, "Aditya");
        students.put(104, "Adi");

        System.out.println("The name of roll no 101 is: " + students.get(101));
    }
}
