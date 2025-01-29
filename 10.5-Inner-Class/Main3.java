// Anonymous Inner Class
// An anonymous inner class in Java is a special type of inner class that does not have a name. 
// It is used to create a one-time implementation of an interface, abstract class, or even a concrete class. 
// These classes are declared and instantiated in a single expression and are typically used to provide immediate, 
// short-lived functionality.
// Thats why Anonymous inner class dont have constructor that help only one-time implementation.

class A {

    public void show() {
        System.out.println("in A show");
    }
}

class Main3 {

    public static void main(String[] args) {
        A obj = new A() {

            @Override
            public void show() {
                System.out.println("in new class");
            }
        };
        obj.show();
    }
}
