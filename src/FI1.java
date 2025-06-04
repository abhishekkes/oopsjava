import java.util.function.Predicate;

public class FI1 {
    public static void main(String[] args) {
        MyFI f = () -> System.out.println("Executing...");
        f.execute(); // Output: Executing...
    }
}


