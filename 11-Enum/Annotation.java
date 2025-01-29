// Annotations in Java are a powerful mechanism that provides metadata about the program's code. 
// They are used to give additional information to the compiler, 
// runtime, or other tools, helping in tasks like code analysis, configuration, and processing.

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{
    @Override //Here if want to override and given wrong method name, than it will show error.
    public void show(){
        System.out.println("in B show");
    }
}
public class Annotation{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}