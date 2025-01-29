// Interface help us to implement specialize concept in generalize way.
// It help us to hide implementation hiding
// It only contain abstract method by default.
// So we can initialize variable in interface, but they are defaultly final and static.
// So, then the question arise why interface cannot initialize So--
//Because it does not have its own heap memory and using class memory.Just use for implementation purposes.


interface Computer{
    int ram = 4; //final an static 
    void code();
}
class Laptop implements Computer{
    @Override
    public void code(){
        System.out.println("Coing in laptop");
    }
}
class Desktop implements Computer{
    @Override
    public void code(){
        System.out.println("Coding in desktop");
    }
}

class Developer{
    public void code(Computer com){
        com.code();
    }
}

class Main1{
    public static void main(String args[]){
        Developer dev = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        dev.code(lap);
        dev.code(desk);
        System.out.println(Computer.ram);

    }
}