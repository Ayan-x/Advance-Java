
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*TRY OUT WITH RESOURCES
->Java introduced this functionality were you can put resources in try paranthesis which 
is going to close automatically after being used.

*/ 
class Main5{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number");
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}