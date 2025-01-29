// Try-catch block are used for exceptional hanling
// Critical Statement(Which can go wrong) are put in to try block.
// If there is error in try block, then catch block will executed else try will run.
// Exception is a class and (e) is a reference variable where the 
// exception is going to be stored.
class Main2{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 18/i;
        } catch (Exception e) {
            System.out.println("Something went wrong "+e);
        }
        System.out.println(j+"\nBye");
    }
}