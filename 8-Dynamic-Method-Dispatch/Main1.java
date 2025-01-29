
// Dynamic Method Dispatch (also known as runtime polymorphism) is a key concept in object-oriented programming in Java.
//  It refers to the process by which a call to an overridden method is resolved at runtime rather than at compile time.
// So, if we are making a obj A class with reference of A class then it would call method of A class.
// But, if we are making object of B class with refernce variable of A class then it would call method of B class.
// This resolve will happen at runtime.  
class A {

    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {

    @Override
    public void show() {
        System.out.println("in B show");
    }
}

class Main1 {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        B obj1 = new B();

    }
}
