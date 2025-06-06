import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue (enqueue)
        queue.add("Apple");
        queue.offer("Banana"); // alternative to add()
        queue.add("Cherry");
        queue.offer("Mango");

        System.out.println("Queue: " + queue);

        // Removing elements from the Queue (dequeue)
        String firstElement = queue.remove();
        System.out.println("Removed element: " + firstElement);

        // Peeking at the head of the queue
        String head = queue.peek();
        System.out.println("Head of queue: " + head);

        // Check if queue contains an element
        System.out.println("Contains 'Banana'? " + queue.contains("Banana"));

        // Size of the queue
        System.out.println("Queue size: " + queue.size());

        // Iterating through the queue
        System.out.println("\nIterating through queue:");
        for(String fruit : queue) {
            System.out.println(fruit);
        }

        // Removing all elements
        queue.clear();
        System.out.println("\nQueue after clear: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}