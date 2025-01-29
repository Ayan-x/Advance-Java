// FUNCTIONAL INTERFACE with anonymous class
@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("in B show");
//     }
// }
class Main4{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in obj show");
            }
        };
        obj.show();

        A obj2 = new A(){
            public void show(){
                System.out.println("in obj2 show");
            }
        };
        obj2.show();
    }
}