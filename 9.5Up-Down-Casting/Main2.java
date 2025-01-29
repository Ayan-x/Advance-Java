
class A {

    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {

    public void show2() {
        System.out.println("in B show");
    }
}

class Main2 {

    public static void main(String args[]) {
        // So this is called downcasting where a sub class reference variable,
        // store a object of sub class and actual object must be of that subclass 
        // only otherwise it will give error.
        // But they are able to access both class A and class B method.
        A obj = new B();
        B obj2 = (B) obj;
        obj2.show1();
        obj2.show2();

    }
}
