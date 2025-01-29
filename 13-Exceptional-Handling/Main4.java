/* THROW KEYWORD
It is used to throw the exception if that condition will get held.
It is also used to make your personalized exception
*/

class MyException extends Exception{
    // String str = new String("");
    public MyException(String str){
        super(str);
    }
}
class Main4{
    public static void main(String[] args) {
        int i = 20;
        int j;
        try {
            j = 18/i;
            if(j ==0){
                throw new MyException("Dont want to print zero");
            }
        } catch (MyException e) {
            j = 18/1;
            System.out.println("This is default value "+e);

        }
        System.out.println(j);
    }
}