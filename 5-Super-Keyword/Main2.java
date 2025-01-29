
class A extends Object{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in parametrized A");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        System.out.println("in parametrized B");
    }
}
// Here we are calling parametrized constuctor of B and 
// Calling paramterized consturctor of A by putting argument in super method

class Main2{
    public static void main(String[] args) {
        B obj = new B(5);
    }
}