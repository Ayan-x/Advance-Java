/* Priority of Thread
There would be a thread priority between 1 to 10.
You can suggest your scheduler for a thread by setting priority

*/ 

/*
Thread- Light wieght processe or smallest unit with which someone can work.
Executing a thread
1->Extend class by Thread class
2->Start thread by object.start()
3-> Class should have run method because obj.start() is going to execute run method only.

Sleep -> 
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

public class Main2{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}