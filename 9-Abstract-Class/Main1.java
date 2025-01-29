// About abstract we have learnt that
// If you want to define method which can be implemented by other class, you can do with abstract class.
// It also help in implementation hiding.
// But , the object would be created of the latest sub class(called concrete class) an reference variable can be used of superclass.
// In abstract, you can have both abstract and normal methods.
// You cant create object of abstract class.

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void color() {
        System.out.println("Blue color");
    }
}

abstract class WagonR extends Car {

    @Override
    public void drive() {
        System.out.println("You can drive this car");
    }

}

@SuppressWarnings("unused")
class SuperWagonR extends WagonR {

    @Override
    public void fly() {
        System.out.println("This car can fly");
    }

    public void engine() {
        System.out.println("1000 cc engine");
    }
}

class Main1 {

    public static void main(String args[]) {
        Car obj = new SuperWagonR();
        obj.drive();
        obj.fly();
        obj.color();
        // obj.engine(); // but this will give error
        // because this is not defined in superclass.
    }
}
