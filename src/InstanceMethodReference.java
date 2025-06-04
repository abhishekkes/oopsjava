import java.util.function.Consumer;

public class InstanceMethodReference {
    public void display(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        InstanceMethodReference obj = new InstanceMethodReference();
        Consumer<String> printer = obj::display;
        printer.accept("Hello, method reference!");
    }
}
