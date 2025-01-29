// Roll Switch statement with enum
// Also using anonymous class to print the object 
enum Status{
    Pending, Running, Completed, Failed;
}

class Main3{
    public static void main(String args[]){
        Status s = Status.Running;

        switch (s) {
            case Running -> System.out.println("All good");
            case Pending -> System.out.println("Please wait");
            case Failed -> System.out.println("Something went wrong");
            default -> System.out.println("Done");
        }

    }
}