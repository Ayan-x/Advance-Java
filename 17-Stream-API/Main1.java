
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// STREAM - API
// Stream API is used for duplicating data structure values in a sequence manner.
// It provide different functionalities.
// It is also implements Functional Interface, So we can use lambda expression.
// But, we can use Stream only one time, like river flows.
/**
 * Why Streams Are Single-Use -->Pipeline Processing: A stream processes
 * elements in a pipeline of operations (like filtering, mapping, reducing).
 * Once the terminal operation executes, the pipeline is considered consumed.
 * -->Internal State: Streams maintain an internal state that tracks their
 * progress. After consumption, this state cannot be reset or reused.
 */
public class Main1 {

    public static void main(String args[]) {
        List<Integer> ls = Arrays.asList(2, 3, 4, 6, 7, 5);

        Stream<Integer> s1 = ls.stream();
        s1.forEach(s -> System.out.println(s));
        // s1.forEach(s -> System.out.println(s)); --If you try to use stream second time it will give error

    }
}
