import java.util.Vector;
import java.util.Iterator;

public class Vector1 {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add(1, "Mango"); // Insert at specific position

        // Displaying Vector
        System.out.println("Vector: " + vector);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Checking if element exists
        System.out.println("Contains 'Banana'? " + vector.contains("Banana"));

        // Removing elements
        vector.remove("Banana");
        vector.remove(0);
        System.out.println("After removal: " + vector);

        // Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Iterating through Vector
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = vector.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIterating using for-each:");
        for(String fruit : vector) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using index:");
        for(int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }

        // Clearing the Vector
        vector.clear();
        System.out.println("\nAfter clear: " + vector);
        System.out.println("Is empty? " + vector.isEmpty());
    }
}
