import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        displayInitialSet(createSet());
        displayEditedSet(modifiedSet(createSet()));
    }

    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("kiwi");
        set.add("strawberry");
        set.add("mango");

        return set;
    }

    private static Set<String> modifiedSet(Set<String> set) {
        set.removeIf(str -> str.contains("kiwi"));
        return set;
    }

    public static void displayInitialSet(Set<String> set) {
        System.out.println("Initial data:");
        displaySet(set);
    }

    public static void displayEditedSet(Set<String> set) {
        System.out.println("\nUpdated data:");
        displaySet(set);
    }

    private static void displaySet(Set<String> set) {
        int index = 1;
        for (String fruits : set) {
            System.out.println(index++ + ") " + fruits);
        }

    }
}
