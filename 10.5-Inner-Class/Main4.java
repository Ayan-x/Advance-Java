// So, this is how we implement abstract class through 
// anonymous inner class.

abstract class A {

    public abstract void show();

    public abstract void config();

}

class Main4 {

    public static void main(String[] args) {
        A obj = new A() {

            @Override
            public void show() {
                System.out.println("in new class");
            }

            @Override
            public void config() {
                System.out.println("Configuration done");
            }
        };
        obj.show();
    }
}
