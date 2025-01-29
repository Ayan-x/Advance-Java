/** RUNNNABLE INTERFACE
 * This interface is used to make thread
 * Thread class also implements the Runnable interface.
 */


class A implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("Hi");
        }
    }
}

class Main4{
    public static void main(String[] args) {
        Runnable obj = new A();

        Thread t1 = new Thread(obj);
        t1.start();
    
    }
}