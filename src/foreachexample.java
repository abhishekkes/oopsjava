import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class foreachexample {
    public static void main(String[] args) {
        List<Integer> marks= Arrays.asList(12,23,35,37,3,45);
        List<Integer> filtered= (List<Integer>) marks.stream().filter(x->x>33).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
