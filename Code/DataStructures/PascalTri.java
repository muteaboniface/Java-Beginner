package DataStructures;

public class PascalTri {
    public static void main(String[] args){
        printPascalTri(7);
    }
        public static void printPascalTri(int size) { //define your function

            //write your code here for making and displaying pascals triangle
            //use can use \n to move numbers to next line in the triangle
            //use " " to add space between numbers in triangle
            int n = size;
            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++) { //assign values to the arr
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) { //if row=column=> 1
                        arr[i][j] = 1;
                    } else if (j > i) { //if cols is greater than rows > 0
                        arr[i][j] = 0;
                    }
                    else { //if row<columns=> fill matrix appropriately
                        if (j == 0){ // first term
                            arr[i][j] = 1;
                        }
                        else{
                            arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; // add number above and its previous
                        }
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) { //print the array
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i][j] != 0){
                    System.out.print(arr[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
}

// Optiized Solution

//
//class HelloWorld {
//
//    public static void main( String args[] ) {
//
//        int size = 5;
//
//        int[][] pascalTr = new int[size][size];
//
//        int row, col;
//
//        //assign zero to every array element
//
//        for (row = 0; row < size; row++)
//
//            for (col = 0; col < size; col++)
//
//                pascalTr[row][col] = 0;
//
//        //first and second rows are set to 1s
//
//
//
//        pascalTr[0][0] = 1;
//
//        pascalTr[1][0] = 1;
//
//        pascalTr[1][1] = 1;
//
//
//
//
//
//        for (row = 2; row < size; row++) {
//
//            pascalTr[row][0] = 1; //first column
//
//            for (col = 1; col <= row; col++) { // the lower half
//
//                pascalTr[row][col] = pascalTr[row - 1][col - 1] + pascalTr[row - 1][col];
//
//            }
//
//        }
//
//
//
//        //display the Pascal Triangle
//
//        for (row = 0; row < size; row++) {
//
//            for (col = 0; col <= row; col++) {
//
//                System.out.print(pascalTr[row][col] + " ");
//
//            }
//
//            System.out.print("\n");
//
//        }
//
//    }
//
//}
