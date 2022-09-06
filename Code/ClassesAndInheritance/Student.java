package ClassesAndInheritance;

class Student {
    public String name;
    public int age;

    public void setAge(int a) {
        age = a;
    }
}

class UnderGrad extends Student {
    public UnderGrad() {
        this.age = 10;
        this.name = "John Doe";
    }
    public void set_age(int a) {
        if (a < 50) {
            age = 0;
        } else {
            super.setAge(a);
        }
    }
}

class example {
    public static void main(String[] args) {
        UnderGrad one = new UnderGrad();
        System.out.println("Age without any method called, only constructor: " + one.age);
        one.set_age(50);
        System.out.println("Age after set_age(50) is called: " + one.age);
        one.set_age(10);
        System.out.println("Age after set_age(10) is called: " + one.age);
    }
}

//
// Calculate are
//class rightAngleTriangle {
//
//    //Define the member variables, constructor and
//
//    // relevant area method
//    // create private members
//    private double length;
//
//    private double height;
//
//
//    // create an overloaded constructor which is public.
//     // objects of type rightAngleTriangle can be made from any class
//     //    public rightAngleTriangle(int l, int h) {
//
//        length = l;
//
//        height = h;
//
//    }
//
//
//
//    public double area() {
//
//        return (length * height / 2.0);
//
//    }
//
//}
//
//
//
//class challenge_one {
//
//    public static double test(rightAngleTriangle rt) {
//
//        return rt.area();
//
//    }
//
//    public static void main( String args[] ) {
//
//        rightAngleTriangle one= new rightAngleTriangle(3,5);
//
//        System.out.println("Area of right Angle traingle:" + test(one));
//
//    }
//
//}
//
//
//

// // Inheritance
// // the get_methods are used to show inheritance.
//  // Used without instantiating the Animal class0
//class Animal {
//
//    //declare private members here
//    private String name;
//    private int age;
//
//
//    void set_data(int a, String b) {
//        //initialize members here
//        name = b;
//        age = a;
//    }
//
//
//    //implement getters here
//    public int get_age(){
//        return age;
//    }
//    public String get_name(){
//        return name;
//    }
//}
//
////define derived class named "Zebra" here
//class Zebra extends Animal {
//    String message_zebra(String str) {
//        //define here
//
//        str = "The zebra named "+ get_name()+ " is " + get_age()+" years old. The zebra comes from Africa";
//        return str;
//    }
//}
//
////define derived class named "Dolphin" here
//
//class Dolphin extends Animal {
//    String message_dolphin(String str) {
//        //define here
//
//        str = "The dolphin named "+ get_name()+ " is " + get_age()+" years old. The dolphin comes from New Zealand";
//        return str;
//    }
//}
