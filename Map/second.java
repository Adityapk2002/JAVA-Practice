package Map;

import java.util.HashMap;
import java.util.Map;

public class second {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Aditya", 100);
        marks.put("Parth", 90);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.print(entry.getKey() + "-----");
            System.out.println(entry.getValue());
        }
    }
}
