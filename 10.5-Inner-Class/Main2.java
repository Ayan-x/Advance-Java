// Outer class can not be static because it works on top-level.
// But inner class can be static.
class Outer{
    public void show(){
        System.out.println("in outer class");
    }
    static class Inner{
        public void show(){
            System.out.println("in Inner class");
        }
    }
}
class Main2{
    public static void main(String args[]){
        // Outer obj1 = new Outer();
        // obj1.show();
// By makinginner class you can access it with outer class directly without making a object
        Outer.Inner obj2 = new Outer.Inner();
        obj2.show();
    }
}