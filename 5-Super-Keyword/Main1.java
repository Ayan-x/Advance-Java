// Here by default super method is calling consturctor of A
// When we making object of B.
// Super method is used for calling constructor of Super class. 
// So we don't need to write super method , it will get called by default
// And Since every class is inherited for Object class , so 
// super method of A will call consturctor of Object class.
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
        System.out.println("in parametrized B");
    }
}

class Main1{
    public static void main(String[] args){
        B obj = new B(5);
    }
    
}