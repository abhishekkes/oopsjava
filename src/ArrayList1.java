import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Initial ArrayList: " + fruits);

        // 2. Adding element at specific index
        fruits.add(2, "Grapes");
        System.out.println("After adding Grapes at index 2: " + fruits);

        // 3. Accessing elements
        System.out.println("Element at index 3: " + fruits.get(3));

        // 4. Checking if element exists
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Pineapple'? " + fruits.contains("Pineapple"));

        // 5. Finding index of element
        System.out.println("Index of 'Banana': " + fruits.indexOf("Banana"));
        System.out.println("Index of 'Pineapple': " + fruits.indexOf("Pineapple"));

        // 6. Updating an element
        fruits.set(1, "Blueberry");
        System.out.println("After updating index 1: " + fruits);

        // 7. Removing elements
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);

        fruits.remove(0);
        System.out.println("After removing index 0: " + fruits);

        // 8. Checking size and if empty
        System.out.println("Size of ArrayList: " + fruits.size());
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());

        // 9. Iterating through ArrayList
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nIterating using ListIterator (backwards):");
        ListIterator<String> listIterator = fruits.listIterator(fruits.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // 10. Converting to array
        String[] fruitsArray = new String[fruits.size()];
        fruitsArray = fruits.toArray(fruitsArray);
        System.out.println("\nArray from ArrayList:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }

        // 11. Clearing the ArrayList
        fruits.clear();
        System.out.println("\nAfter clearing: " + fruits);
        System.out.println("Is ArrayList empty now? " + fruits.isEmpty());
    }
}