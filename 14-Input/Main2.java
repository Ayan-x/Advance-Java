
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* BUFFER READER
Before Scanner, We are using buffer reader for taking input of full line.
But it defaultly give string.
If you want a integer then you need to change it.
Since, through bufferedReader you can also take input from file or database(resources).
So, you need close it which stop leaking of resuorces.
*/ 
class Main2{
    public static void main(String[] args) {
        
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        try {
            System.out.println("Enter a number");
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            bf.close();
        } catch (IOException ex) {
        }
        
    }
}