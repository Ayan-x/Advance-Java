
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// More functionalities
public class Main3 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 6, 5, 2, 3);

        Stream<Integer> s1 = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted();
        s1.forEach(n -> System.out.println(n));

    }
}
