package ClassesAndInheritance;

// A class of pet objects
public class MyClassPet {
    // Fields / members / instance variables

    // static /class fields > only one copy of this variable can exist
    // regardless of the number of objects
    private static int newID;
    private int petID;
    private String petType;
    private String petName;
    private int petAge;

    // similar to the init method in python
    // Constructor with parameters
    public MyClassPet(String type, String name, int age) {
        petType = type;
        petID = newID;
        petName = name;
        petAge = age;

        newID = newID + 1;
    }

    public String getName() {
        return petName;
    }

    // static / class methods
    // Do not affect a specific object in a class

    public static int getNewID() {
        return newID;
    }


    public void printPetDetails() {
        System.out.println("Pet ID: " + petID);
        System.out.println("Pet Type: " + petType);
        System.out.println("Pet Name: " + petName);
        System.out.println("Pet Age: " + petAge);
    }


}
// Inner class
class PetList {
    public static void main(String[] args) {

        // Declaring objects of a class
        MyClassPet myDog = new MyClassPet("dog", "Ruffy", 3);
        // dot operator used to access members of a class object
        myDog.printPetDetails();

        MyClassPet newcat = new MyClassPet("cat", "Princess", 2);
        newcat.printPetDetails();
        System.out.println("Pet Name: " + newcat.getName());
        System.out.println("New ID " + newcat.getNewID());
        System.out.println("New ID " + newcat.getNewID());
    }
}
