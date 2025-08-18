package Stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aditya", "Parth", "Yash", "Sujal");
        List<String> result = names.stream().filter(name -> name.startsWith("A")).toList();
        System.out.println(result);
    }
}
