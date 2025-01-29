
// If-else with enum
enum Status{
    Pending, Running, Completed, Failed;
}

class Main2{
    public static void main(String args[]){
        Status s = Status.Completed;

        if(s == Status.Running)
            System.out.println("All good");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else if(s == Status.Failed)
            System.out.println("Something went wrong");
        else
            System.out.println("Done");

    }
}