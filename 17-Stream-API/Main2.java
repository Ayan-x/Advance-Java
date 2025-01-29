
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Functionalities of Stream
// In filter , we filter the element on behalf of given condition.
// In map, we map all the elements on the given condition.
// In reduce, the answer would be reduce to one which can be stored in a variable through conditions.
public class Main2 {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(2, 5, 6, 3, 8);
// !st ways
        Stream<Integer> s1 = ls.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result = s3.reduce(0, (a, b) -> a + b);

        System.out.println(result);

        // 2nd way->shorter one
        int result2 = ls.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (a, b) -> a + b);
        System.out.println(result2);
    }
}
