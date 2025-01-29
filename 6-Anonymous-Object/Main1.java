class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show method");
    } 

}
// In anonymous object we dont assign object in reference
// variable. It will call constructor when it get created.
// But this object can be used only one time when it get called.
// Every time it will make a new object to call 
public class Main1{
    public static void main(String[] args){
        new A().show(); //Anonymous object
        new A().show(); //These two object are different and using separate heap memory.
    }
}