import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding elements
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 30);
        hashMap.put("Grapes", 40);
        hashMap.put("Mango", 50);

        // Display the HashMap (order not guaranteed)
        System.out.println("HashMap contents: " + hashMap);

        // Access a value
        System.out.println("Quantity of Apple: " + hashMap.get("Apple"));

        // Check if a key exists
        System.out.println("Contains key 'Banana'? " + hashMap.containsKey("Banana"));

        // Iterate through the HashMap
        System.out.println("\nIterating through HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove an element
        hashMap.remove("Orange");
        System.out.println("\nAfter removing Orange: " + hashMap);

        // Size of HashMap
        System.out.println("Size of HashMap: " + hashMap.size());
    }
}