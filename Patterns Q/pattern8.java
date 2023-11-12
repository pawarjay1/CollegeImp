public class pattern8 {
    public static void pattern_8(int n) {

        for (int i = 0; i < n; i++) {
            
            // space
                for(int j = 0; j<i; j++){
                    System.out.print(" "); 
                }
            // star

                // the main formula to print 9,7,5,3,1 serias is 2n-(2i+1).
                for(int k = 0; k<2*n-(2*i+1); k++){
                    System.out.print("*"); 
                }
            // space
                for(int j = 0; j<i; j++){
                    System.out.print(" "); 
                }

            System.out.println(); 

        }
    }

    public static void main(String args[]) {

        int n = 5;
        pattern_8(n);
    }
}

// input : 5 

// result : 

//  *********
//   *******
//    ***** 
//     ***    
//      *