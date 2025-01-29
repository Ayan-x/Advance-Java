/*
* Runnable Interface and anonymous class, lambda expression
*/ 

class Main5{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
            }
        });
        t2.start();
    }
}