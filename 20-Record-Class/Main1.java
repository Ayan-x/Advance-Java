
/** RECORD CLASSES
 * If we want to make class which is used for storing and
 * givng data like a data carrier class , we can use
 * record classes which make the code shorter.
 *
 * Behind the scene, it is making constructor which is called canonical
 * constructor. It is implementing all the methods behind the code.
 * Canonical constructor are those who contain same parameter as present
 * on the initialization of record class.
 *
 * All the variables are final and there is no setter method
 * to change it.
 *
 * one can create all the methods and variable except instance method
 */
record Alien(int num, String name) {

    // Compact Canonical Constructor
    public Alien  {
        if (num == 0) {
            throw new IllegalArgumentException("id cannot be zero");
        }
    }

};

public class Main1 {

    public static void main(String[] args) {
        Alien a1 = new Alien(1, "Ayan");
        Alien a2 = new Alien(1, "Ayan");
        Alien a3 = new Alien(0, "Ayan1"); //this will give error
        System.out.println(a1.equals(a2));
        System.out.println(a1);
        System.out.println(a1.name());

    }
}
