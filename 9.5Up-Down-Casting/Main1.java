class A{
    public void show1(){
        System.out.println("in A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
}


class Main1{
    public static void main(String args[]){
        // So this is called upcasting where a super class reference variable,
        // store a object of sub class.
        // But they are able to get class A method only.
        A obj = (A) new B();
        obj.show1();
        // obj.show2(); this will give error

    }
}