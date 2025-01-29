@FunctionalInterface
interface sum{
    int add(int a, int b);
}
class Main2{
    public static void main(String[] args) {
    //    sum obj = (a,b) -> System.out.println("Sum : "+(a+b));
       sum obj2 = (i,j) -> i+j;
    //    obj.add(4,5);
       int res = obj2.add(2,3);
       System.out.println("Sum : "+res);

    }
}