// None of this solutions attached will pass the final test case, Help me // optimize this code..

// Time Limit exceeded always results
// Implementation of the same logic using python passes all the test cases
// python code is commented below


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

             String[] prim_array = br.readLine().split("\\s");
			// Get index that starts our recon string
            int track = 0;
            int j_n =0;
            String str = "";
			for (int j=0; j < len; j++) {
				j_n = j + rot;
                if(j_n % len == 0){
                    track = j;
                    break;
                }
                else{
                    str += prim_array[j]+ " "; // get a section of the string
                }
            
            }
			// print from track to end
			for(int i = track; i<len; i++){
                System.out.print(prim_array[i]+" ");
			}
            // add str1 to str
            System.out.println(str);
			
            test_cases--;
			
		}
	}
}
// First Attempt
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

            String[] prim_array = br.readLine().split("\\s");

            
            String[] rotated = new String[len];
			
			// update indexes and store appropriately
			for (int j=0; j < len; j++) {
				// recompute index
				int j_n = j + rot;
                j_n = (j_n >= len) ? j_n % len:j_n+0;
				
				rotated[j_n] = prim_array[j]+" ";
			}
			
			
			// How can we eradicate this second for loop to optimize on runtime
			
			
			for(String s : rotated){
                System.out.print(s);
				//answer += s +" ";
			}
            System.out.println();
			
            test_cases--;
			
		}
	}
}
		
*/
		
		
// 2nd attempt
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

             String[] prim_array = br.readLine().split("\\s");
			

            String[] rotated = new String[len];
			// Get index that starts our recon string
            int track = 0;
            int j_n =0;
			for (int j=0; j < len; j++) {
				j_n = j + rot;
                if(j_n % len == 0){
                    track = j;
                    break;
                }
            }
			// Array reconstruction
            String[] subset1 = Arrays.copyOfRange(prim_array, track, len);
            String[] subset2 = Arrays.copyOfRange(prim_array, 0, track);

            int len_sub = subset1.length;
            int len_sub2 = subset2.length;


            // add the two arrays together
            System.arraycopy(subset1, 0, rotated, 0, len_sub);
	        System.arraycopy(subset2, 0, rotated, len_sub,len_sub2);


			for(String s : rotated){
                System.out.print(s+" ");
				//answer += s +" ";
			}
            System.out.println();
			
            test_cases--;
			
		}
	}
}
*/
// 3rd attempt
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

             String[] prim_array = br.readLine().split("\\s");
			

            String[] rotated = new String[len];
			// Get index that starts our recon string
            int track = 0;
            int j_n =0;
			for (int j=0; j < len; j++) {
				j_n = j + rot;
                if(j_n % len == 0){
                    track = j;
                    break;
                }
            }
			// Array reconstruction

            // add the two arrays together
            System.arraycopy(prim_array, track, rotated, 0, len-track);
	        System.arraycopy(prim_array, 0, rotated, len-track,track);


			for(String s : rotated){
                System.out.print(s+" ");
				//answer += s +" ";
			}
            System.out.println();
			
            test_cases--;
			
		}
	}
}
		
*/


// B4th attempt
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

             String[] prim_array = br.readLine().split("\\s");
			

            String[] rotated = new String[len];
			// Get index that starts our recon string
            int track = 0;
            int j_n =0;
			for (int j=0; j < len; j++) {
				j_n = j + rot;
                if(j_n % len == 0){
                    track = j;
                    break;
                }
            }
			// Array reconstruction
            // print from track to end
            // print from o to track

			for(int i = track; i<len; i++){
                System.out.print(prim_array[i]+" ");
			}
            for(int i = 0; i<track; i++){
                System.out.print(prim_array[i]+" ");
			}

            System.out.println();
			
            test_cases--;
			
		}
	}
}
*/

// 5th attempt.

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Rotate {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());  // Reading input from STDIN

        while(test_cases >=1){
            String[] conditions = br.readLine().split("\\s");
            int rot = Integer.parseInt(conditions[1]);
            int len = Integer.parseInt(conditions[0]);

             String[] prim_array = br.readLine().split("\\s");
			// Get index that starts our recon string
            int track = 0;
            int j_n =0;
            String str = "";
			for (int j=0; j < len; j++) {
				j_n = j + rot;
                if(j_n % len == 0){
                    track = j;
                    break;
                }
                else{
                    str += prim_array[j]+ " "; // get a section of the string
                }
            
            }
			// print from track to end
			for(int i = track; i<len; i++){
                System.out.print(prim_array[i]+" ");
			}
            // add str1 to str
            System.out.println(str);
			
            test_cases--;
			
		}
	}
}

*/
 // python solution
/*
// Python Solution: Which passes all the test cases. Uses the same logic as in Java, and takes less time.
// Someone help me know why..

name = input() 

test_c = int(name)
while test_c >= 1:
    instructions = input().split()
    length = int(instructions[0])
    rot = int(instructions[1])

    string = input().split()
    track = 0;
    j_n =0;
    str_temp = "";

    for j in range(length):
        j_n = j + rot;
        if j_n % length == 0 :
            track = j;
            break;
        else:
            str_temp += string[j]+ " ";
            
    for i in range(track,length):
        print(string[i],end=" ");

    print(str_temp);
        
    test_c = test_c-1

		
*/