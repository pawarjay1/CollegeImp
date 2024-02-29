package PatternsQ;

public class pattern_9 {
    public static void main(String[] args) {
        int n = 5; 

        for(int i=1; i<n; i++){

            // space 
            for(int j=1; j<i; j++){
                System.out.print("-");
            }

            // star 
            for(int k=1; k<=n*2-(i*2+1); k++){
                System.out.print("*");
            }

            // space 
            for(int j=1; j<i; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

// *******
// -*****-
// --***--
// ---*---
