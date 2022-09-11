import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Inversion {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN

        // Approach
        // while loop that checks number of test cases
        // obtain the matrix dimension
        // use a for loop to assign values to a matrix.
        int test_cases = Integer.parseInt(name); // obtain number of test_cases
        while (test_cases >= 1){
            int dims = Integer.valueOf(br.readLine()); // obtain the matrix dimensions
            int[][] matrix = new int[dims][dims]; // initialize an empty array of given size

            for(int i = 0; i< dims; i++){  // assign elements from stdin to array
                String[] mat_val = br.readLine().split("\\s"); // string with spaces removed
                for(int j = 0; j< dims; j++){ // assign to matrix
                    matrix[i][j] = Integer.valueOf(mat_val[j]);
					//System.out.println(matrix[i][j]);
                } 
            }
			
            // read through the matrix checking for values that satisfy the conditions above
            int counter = 0;
            for(int k = 0; k< dims; k++){
                for(int tmp = 0; tmp< dims; tmp++){
                    int i_ = k;
                    int j_ = tmp; // value to check against
                    for(int l = 0; l< dims; l++){
                        for(int m = 0; m< dims; m++){
                            // check first condition then check values that are greater than reference value and increment counter
                            if(i_ <= l && j_ <= m){
                                if(matrix[i_][j_] > matrix[l][m]){
                                    counter ++;
                                }
                            }
                        }
                    }
                }
                
            }
            System.out.println(counter); // Writing output to STDOUT
            test_cases--;
        }
        
    }
}

// Takeaways
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//  String name = br.readLine();
// String[] mat_val = name.split("\\s");
