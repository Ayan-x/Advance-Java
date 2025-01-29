
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collection API -> this is concept of making inbuit data structure which ease
 * developer to use it Collection -> This is interface which implemented on many
 * other interfaces like list , queue, set etc. These interfaces implemented on
 * different classes. Collections -> This is class which provide many
 * functionalities like sorting, comparing etc.
 *
 * Comparator -> This is a interface in which you can compare two element of any
 * object(data structure). compare method of Comparator Interface -> So, this
 * method is used to compare between two elements and if you want to swap then
 * return 1 else return -1;
 *
 */
class Main1 {

    public static void main(String args[]) {

        List<Integer> ls = new ArrayList<>();
        ls.add(29);
        ls.add(31);
        ls.add(72);
        ls.add(65);

        // So here we are doing sorting on the basis of 2nd number of element
        // Output - [31,72,65,29]
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(ls, com);
        System.out.println(ls);

    }
}
