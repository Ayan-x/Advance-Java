
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("aaa");
        ls.add("a");
        ls.add("aaaaa");
        ls.add("aaaa");

        // Comparator<String> com = new Comparator<String>() {
        //     public int compare(String i, String j) {
        //         if (i.length() > j.length()) {
        //             return 1;
        //         } else {
        //             return -1;
        //         }
        //     }
        // };
        // Through lambda expression
        Comparator<String> com = (String i, String j) -> {
            if (i.length() > j.length()) {
                return 1;
            } else {
                return -1;
            }
        };
        Collections.sort(ls, com);
        System.out.println(ls);

    }
}
