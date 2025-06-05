import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements (insertion order maintained)
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Orange", 30);
        linkedHashMap.put("Grapes", 40);
        linkedHashMap.put("Mango", 50);

        // Display the LinkedHashMap (order maintained)
        System.out.println("LinkedHashMap contents: " + linkedHashMap);

        // Access a value
        System.out.println("Quantity of Banana: " + linkedHashMap.get("Banana"));

        // Check if a value exists
        System.out.println("Contains value 30? " + linkedHashMap.containsValue(30));

        // Iterate through the LinkedHashMap (in insertion order)
        System.out.println("\nIterating through LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove an element
        linkedHashMap.remove("Grapes");
        System.out.println("\nAfter removing Grapes: " + linkedHashMap);

        // Size of LinkedHashMap
        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());
    }
}