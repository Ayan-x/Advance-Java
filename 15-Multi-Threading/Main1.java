/*
Thread- Light wieght processe or smallest unit with which someone can work.
Executing a thread
1->Extend class by Thread class
2->Start thread by object.start()
3-> Class should have run method because obj.start() is going to execute run method only.
*/ 

class A extends Thread {
    @Override
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    @Override
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hello");
        }
    }
}

public class Main1{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}