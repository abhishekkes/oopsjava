  import java.util.function.Predicate;

    public class FI2 {
        public static void main(String[] args) {
            Predicate<String> isLong = s -> s.length() > 5;
            System.out.println(isLong.test("Hello")); // false
            System.out.println(isLong.test("Hello World")); // true
        }
    }


