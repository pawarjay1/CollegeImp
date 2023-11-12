public class pattern9 {
    public static void pattern_9(int n) {

        for(int i=0; i<n; i++){
            // space
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            // stare 3-0+1
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            // space    3-0-1
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println(); 
        }
        for(int i=0; i<n; i++){
            // space
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            // stare
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            // space    3-0-1
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {

        int n = 3;
        pattern_9(n);
    }
}

// input : 3

// result : 

//   *  
//  ***
// ***** 
// *****  
//  ***
//   *