
import java.io.IOException;

/*
As you can see, out is a static object of PrintStream which is inside System class
and out can call function println which is used to print the string.

Like this for input , we have Sytem.in where in is a static object of PrintStream
which is inside System class and use to take input but convert it into ASCII code
and can take only one value at a time.Ex->In 55,it will only take 5 and give output 53 in ASCII
*/ 
class Main1{
    public static void main(String[] args) throws IOException{
        System.out.println("Hello");
        System.out.println("Enter a number");
        int num = System.in.read();
        System.out.println(num);
        
    }
}