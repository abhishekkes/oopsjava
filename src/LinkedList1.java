import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.addFirst("Mango");  // Add to the beginning
        fruits.addLast("Orange");  // Add to the end
        fruits.add(2, "Grapes");   // Add at specific index

        System.out.println("Initial LinkedList: " + fruits);

        // Accessing elements
        System.out.println("\nFirst element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());
        System.out.println("Element at index 2: " + fruits.get(2));

        // Removing elements
        fruits.removeFirst();
        fruits.removeLast();
        fruits.remove("Banana");
        System.out.println("\nAfter removals: " + fruits);

        // Checking if list contains an element
        System.out.println("\nContains 'Apple'? " + fruits.contains("Apple"));
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // Size of the LinkedList
        System.out.println("\nSize of LinkedList: " + fruits.size());

        // Iterating through the LinkedList
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        // Clearing the LinkedList
        fruits.clear();
        System.out.println("\nAfter clearing, is list empty? " + fruits.isEmpty());
    }
}