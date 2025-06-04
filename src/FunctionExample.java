import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> wordLength = word -> word.length();

        System.out.println(wordLength.apply("Java"));    // 4
        System.out.println(wordLength.apply("Function")); // 8
    }
}
