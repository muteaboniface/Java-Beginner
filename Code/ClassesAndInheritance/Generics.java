package ClassesAndInheritance;

class Generics {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                MaximumTest.maximum(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                MaximumTest.maximum(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaximumTest.maximum("pear", "apple", "orange"));
    }
}


class MaximumTest {
    // determines the largest of three Comparable objects
    public static < T extends Comparable < T >> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }
}

//// Template
//class Generics {
//    public static < T1, T2, T3 > void temp(T1 x, T2 y, T3 z) {
//        System.out.println("This is x =" + x);
//        System.out.println("This is y =" + y);
//        System.out.println("This is z =" + z);
//
//    }
//    public static void main(String args[]) {
//        temp(1, 2, 3);
//    }
//}
//