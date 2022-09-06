package DataStructures;

public class TwoDims {
    public static void main(String[] args){
    // Declaration of 2D arrays
    //  Datatype[m][n] name;
        char[][] twoDimArray = new char[3][3]; //instantiating a character array of size 3*3 = 9 elements

        twoDimArray[0][0] = 'a'; //stores a at row:0, column:0 position
        twoDimArray[0][1] = 'b'; //stores b at row:0, column:1 position
        twoDimArray[0][2] = 'c'; //stores c at row:0, column:2 position
        twoDimArray[1][0] = 'd'; //stores d at row:1, column:0 position
        twoDimArray[1][1] = 'e'; //stores e at row:1, column:1 position
        twoDimArray[1][2] = 'f'; //stores f at row:1, column:2 position
        twoDimArray[2][0] = 'g'; //stores g at row:2, column:0 position
        twoDimArray[2][1] = 'h'; //stores h at row:2, column:1 position
        twoDimArray[2][2] = 'i'; //stores i at row:2, column:2 position

        //Printing out the stored values

        System.out.print(twoDimArray[0][0] + "  " + twoDimArray[0][1] + "  " + twoDimArray[0][2] + "\n");
        System.out.print(twoDimArray[1][0] + "  " + twoDimArray[1][1] + "  " + twoDimArray[1][2] + "\n");
        System.out.print(twoDimArray[2][0] + "  " + twoDimArray[2][1] + "  " + twoDimArray[2][2]);
    }
}
