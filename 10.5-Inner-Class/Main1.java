// This is a inner class which is inside outer class.
// You cannot access it without outer class.
class Outer{
    public void show(){
        System.out.println("in outer class");
    }
     class Inner{
        public void show(){
            System.out.println("in Inner class");
        }
    }
}
class Main1{
    public static void main(String args[]){
        Outer obj1 = new Outer();
        obj1.show();
// This is how you can make object of inner class.
        Outer.Inner obj2 = obj1.new Inner();
        obj2.show();
    }
}