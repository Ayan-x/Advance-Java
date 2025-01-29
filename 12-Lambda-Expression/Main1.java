/* In java8 , they try to reduce the verbos which
 means to reduce the number of lines,so it introduce some features.
So, we can use Lambda expression but these are only used with functional
interface.

Inside it is calling through anonymous object but to reduce verobs,
it uses lambda Expression
 */
@FunctionalInterface
interface A{
    void show();
}

class Main1{
    public static void main(String[] args) {
        A obj = () ->{
            System.out.println("in A show");
            System.out.println("through lambda expression");
        };
        obj.show();
    }
}