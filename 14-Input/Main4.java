
// import java.awt.SystemTray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import javax.swing.text.AbstractDocument;

// We try to put necessary thing in finally block,because it will execute even try is not going to run.
// Therefore bf.close() has been put in finally block to get executed. 


class Main4{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = null;
        System.out.println("Enter a number");
        try {
            bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);

        } catch (Exception e) {
        }
        finally{
            bf.close();
        }
    }
}