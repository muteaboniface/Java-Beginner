package ClassesAndInheritance;
//constructors
class Pet {
    private int petAge;
    private String petType;
    private String petName;

    //This is the constructor without any paramters
    // default
    public Pet() {
        petAge = 0;
        petName = "";
        petType = "";
    }

    //This is the constructor with parameters
    public Pet(String name, String type, int age) {
        petAge = age;
        petType = type;
        petName = name;
    }

    //This is the copy constructor
    public Pet(Pet copyThisPet) {
        petName = copyThisPet.petName;
        petType = copyThisPet.petType;
        petAge = copyThisPet.petAge;
    }

    public void print() {
        System.out.println("Pet Name: " + petName);
        System.out.println("Pet Type: " + petType);
        System.out.println("Pet Age: " + petAge);
    }

}
class pet_list {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.print();

        Pet cat = new Pet("Princess", "cat", 45);
        cat.print();

        // copy members of previous objectto new object
        Pet cat_copy = new Pet(cat);
        cat_copy.print();

    }
}