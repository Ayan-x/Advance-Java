class Main1{
    public static void main(String[] args){
        // Type conversion is converted a variable of one data type to another datatype;

        byte b = 12;
        int a = b; //Implicit Type conversion where your int range is bigger than your byte range so it will change;
        System.out.println(a);
        // byte c = a; //this will give error of lossy conversion from int to byte
        byte c = (byte) a; //this will run because we have done type casting which comes under explicit conversion
        // It will do this if there is loss of data also
        System.out.println(c);

        int x = 257;
        byte y = (byte) x;
        // But if the value is that big that other data cant handle after type casting then 
        // it will divide the value by range which in case of byte is x%256 i.e. 257%256=1
        System.out.println(y);

    }
}