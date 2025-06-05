import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Current stack: " + stack);

        // Peeking at the top element
        System.out.println("\nTop element (peek): " + stack.peek());

        // Popping elements from the stack
        System.out.println("\nPopping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
            System.out.println("Current stack: " + stack);
        }

        // Checking if stack is empty
        System.out.println("\nIs stack empty? " + stack.isEmpty());

        // Stack underflow example (will throw EmptyStackException)
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println("\nError when popping from empty stack: " + e.getClass().getSimpleName());
        }

        // Additional stack operations
        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("\nNew stack: " + stack);
        System.out.println("Size of stack: " + stack.size());
        System.out.println("Search for 200: Position " + stack.search(200)); // 1-based from top
        System.out.println("Search for 500: " + stack.search(500)); // -1 if not found
    }
}
