package DataStructures;

public class SortArray {
    public static void main(String[] args){
       int []arr = {5, 6, 3, 8, 9, 23, 6,1};
        for (int i =0 ; i < arr.length; i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

        //sort
        int[] sorted = sortAsc(arr);
        for (int i =0 ; i < sorted.length; i++){
            System.out.print(sorted[i]+ "  ");
        }
    }

    // create a method
    // needs not return any value
    // coz the array is passed by referenced
    public static int[] sortAsc(int[] arr) {
    // public static void sortAsc(int[] arr)
        // your code goes here
        boolean fin = false;
        int count = 0;
        int prev;
        int next;

        int[] sorted = arr;
        while (fin==false){
            count = 0;
            for (int i = 0; i < (sorted.length)-1; i++){
                // perform operation only when index is within bounds. from 0-length - 1
                if (sorted[i] > sorted[i+1]) { // if preceding element is smaller than nest, swap positions
                    prev = sorted[i];
                    next = sorted[i+1];
                    sorted[i] = next;
                    sorted[i+1] = prev;
                    // swap letter-

                }
                else{
                    // if eentire loop executes without swapping change fin status
                    if (count == (sorted.length)-2){
                        fin = true;
                    }
                    count++;

                }
            }
        }

        return sorted; // change this and return the correct result array
    }
}
