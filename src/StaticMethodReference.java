import java.util.function.BiFunction;

public class StaticMethodReference {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = StaticMethodReference::add;
        System.out.println(adder.apply(10, 20)); // Output: 30
    }
}

