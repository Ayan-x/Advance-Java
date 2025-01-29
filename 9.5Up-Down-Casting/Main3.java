class Main3{
    public static void main(String args[]){
        int num = 7;
        Integer num1 = new Integer(num); //boxing
        Integer num2 = num; //Auto-boxing

        int num3 = num2.intValue(); //unboxing
        int num4 = num2; //auto-unboxing

    }
}