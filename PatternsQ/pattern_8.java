package PatternsQ;

public class pattern_8 {
    public static void main(String[] args) {
        int n = 5; 

        for(int i=1; i<=n; i++){

            // space 
            for(int j=1; j<n-i+1; j++){
                System.out.print("-");
            }

            // star 
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }

            // space 
            for(int j=1; j<n-i+1; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}


// ----*----
// ---***---
// --*****--
// -*******-
// *********