/* Sleep-> This method used to delay between the next execution of thread. 
*/ 

class A extends Thread {
    @Override
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run(){
        for(int i = 0; i<=100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}

public class Main3{
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        obj2.start();
    }
}
