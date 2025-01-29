
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable Interface-> This can be used with any class to do inbuilt sorting.
 */
class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student that) {
        // throw new UnsupportedOperationException("Not supported yet.");
        if (this.age > that.age) {
            return 1; 
        }else {
            return -1;
        }
    }

}

public class Main4 {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(27, "Ayan"));
        studs.add(new Student(29, "Sameer"));
        studs.add(new Student(19, "Tanay"));
        studs.add(new Student(17, "Vaibhav"));

        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
