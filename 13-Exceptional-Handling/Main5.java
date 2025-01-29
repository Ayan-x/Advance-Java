// THROWS KEYWORD
/*
It is used to duck the exception meaning a method can say I am not going to handle this exception
 */

class A{

    public void show() throws ClassNotFoundException{
        Class.forName("Demo");
    }

}
@SuppressWarnings("unused")
class Main5{
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException ex) {
            System.out.println("Class is not present "+ex);
            ex.printStackTrace(); //It used for printing the stack of class how being
        }
    }
}