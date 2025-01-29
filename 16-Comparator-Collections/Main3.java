// Sorting objects through Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

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

}

public class Main3 {

    public static void main(String[] args) {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(27, "Ayan"));
        studs.add(new Student(29, "Sameer"));
        studs.add(new Student(19, "Tanay"));
        studs.add(new Student(17, "Vaibhav"));

        Comparator<Student> com = (Student i, Student j) -> i.age > j.age ? 1 : -1;
        Collections.sort(studs, com);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
