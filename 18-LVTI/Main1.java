
import java.util.ArrayList;

/**
 * LVTI-Local Variable Type Inference In Java10, for local variable which is not
 * to be stored and it is just for processing purposes , we can use var instead
 * of datatype.
 *
 * Behind the scene, the compiler will change the var into data-type. for using
 * local variable with var , you need to intialize the variable It will give
 * error if you only declare and not initialize it.
 */
public class Main1 {

    public static void main(String[] args) {
        var num = 8;
        var ls = new ArrayList();
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        System.out.println(num);
        ls.forEach(n -> System.out.println(n));
    }
}
