class Student{
    int marks;
    String name;
}
class Main1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 90;
        s1.name = "Ayan";

        Student s2 = new Student();
        s2.marks = 88;
        s2.name = "Sameer";

        Student s3 = new Student();
        s3.marks = 86;
        s3.name = "Vaibhav";

        Student s[] = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;
        for(int i = 0; i<s.length;i++){
            System.out.println(s[i].name+" "+s[i].marks);

        }
        
    }
}