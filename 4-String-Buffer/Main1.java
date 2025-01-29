class Main1{
    public static void main(String[] args) {

        // String Buffer is use to create mutable string. 
        // It contains 16 character when it declared and add initialize string length which make the 
        // capacity = 16+initialized_str_length
        // If the capacity is exceeded, a new, larger array is created, and the old content is copied to the new array.
        // StringBuffer is synchronized, meaning it is thread-safe. Multiple threads can access it without corrupting its state. 
        // However, this synchronization comes with a performance cost compared to StringBuilder.
 
        StringBuffer sb = new StringBuffer("Ayan");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append(" Ahmad");
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}