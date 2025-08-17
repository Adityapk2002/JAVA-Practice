package Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("dragon fruit");

        System.out.println(fruits);
    }
}

// A collection of unique values.
// Stores only keys (values themselves).
// No duplicates allowed.
// Implementations: HashSet, LinkedHashSet, TreeSet.
