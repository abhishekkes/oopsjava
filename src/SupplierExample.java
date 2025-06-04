import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> greet=()-> "Hello From Supplier";
        System.out.println(greet.get());
    }
}
