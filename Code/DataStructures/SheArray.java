public class SheArray {
    public static void main(String args[]) {
        int[] myArray = new int[5]; //Declaration and Instantiation of Array with length 5

        System.out.println("Printing the size of myArray1: " + myArray.length);

        myArray[0] = 2;  //accessing 1st element and assigning value 2 to it
        //
        myArray[1] = 4;  //accessing 2nd element and assigning value 4 to it
        myArray[2] = 6;  //accessing 3rd element and assigning value 6 to it
        myArray[3] = 8;  //accessing 4th element and assigning value 8 to it
        myArray[4] = 10; //accessing 5th element and assigning value 10 to it

        /*Printing the stored values*/

        System.out.println("First element of myArray1 is:  " + myArray[0]);
        System.out.println("Second element of myArray1 is: " + myArray[1]);
        System.out.println("Third element of myArray1 is:  " + myArray[2]);
        System.out.println("Fourth element of myArray1 is: " + myArray[3]);
        System.out.println("Fifth element of myArray1 is:  " + myArray[4]);

        // Using loops to instantiate an array
        int[] myArray1 = new int[10]; // Declaration and Instantiation of Array with length 10

        for (int i = 0; i < myArray1.length; i++) // Iterate through indexes 0-9
        {
            myArray1[i] = i + 1; // Initialize values to 1-10
        }

        for (int i = 0; i < myArray1.length; i++) {
            System.out.println("The value at myArray1[" + i + "] is: " + myArray1[i]);
            // Printing all values to console
        }

        // char arrays
        char[] myChar= new char[5]; //instantiation of second char array
        int index = 0;
        for (char i = 'v'; i <= 'z'; i++) { //Assiging char values to second array using loop

            myChar[index] = i;
            index++;
        }


        // read values of myChar
        for (char c : myChar) {
            // System.out.print(c + ' '); // you obtain numbers
            System.out.print(c + " "); // you obtain the actual chars
        }



        // Called method modifies array in calling method
        int[] arr = {
                1,
                2,
                3,
                4,
                5
        }; //initialize

        System.out.println("The Values before calling the method are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= " + arr[i] + "  "); //printing the array before calling method
        }

        System.out.println();
        multiply(arr, 3); //nothing is being returned
        System.out.println("The Values after calling the method are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "]= " + arr[i] + "  "); //printing the array after calling method

        }
    } //end of main()

    static void multiply(int[] arr, int num) { //will change the values of passed array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * num;
        }
        //Not returning anything
    }

        // whenever primitive datatypes are passed as an argument
        // to a method a copy of the variable is made and passed to that method
        // which means if called method makes any changes to the passed values it is not
        // visible to the calling method


        // As an array is a data structure rather than a primitive data type, it is passed by
        // reference to a method which means that if the called method alters any value of an array this alteration
        // will be visible to the calling method also.



    }
