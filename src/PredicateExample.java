import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> isLongWord = word -> word.length() > 5;

        System.out.println(isLongWord.test("Hello"));       // false
        System.out.println(isLongWord.test("Predicate"));   // true
    }
}
