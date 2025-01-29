
// We can assure different exception for different statement to give claer output.
class Main3{
    public static void main(String[] args) {
        int i = 9;
        int j = 0;
        int[] arr = new int[5];
        try {
            j = 18/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}

/*
Heirarchy of Exception
Object->Throwable->Exception
          |->Error->
*/