enum Status{
    Pending, Running, Completed, Failed;
}

class Main1{
    public static void main(String args[]){
        Status s = Status.Completed;
        System.out.println(s); //Completed
        System.out.println(s.ordinal()); //2 give index of object

        // for getting all the object of Status
        Status[] statusArr = Status.values();
        for(Status stat:statusArr){
            System.out.print(stat+" ");
        }
    }
}