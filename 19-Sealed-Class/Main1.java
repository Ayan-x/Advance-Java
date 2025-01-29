// This is the new feature of java of sealed class.

/** In sealed class, you can give permission which class is going to be permitted
 * for inheritance.
 * But if some class extending sealed class which has been permitted, it
 * needed to be defined as sealed or non-sealed or final class.
 *
 * Non-sealed are going to work like normal class.
 */
sealed class A permits C, B, D {

    public A() {
        System.out.println("No error");
    }

    public void show() {
        System.out.println("in A show");
    }
}

non-sealed class B extends A {

    public B() {
        System.out.println("in B constructor");
    }
}

final class C extends A {

}

sealed class D extends A permits E {

}

non-sealed class E extends D {

}

class X {

    public X() {
        System.out.println("in X constructor");
    }
}

public class Main1 {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        System.out.println("Hii");
        X obj2 = new X();
        B obj3 = new B();

    }
}

/**
 * We can also make interface sealed or non-sealed but inteface cant be final.
 */
