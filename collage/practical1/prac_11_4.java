package collage;

public class prac_11_4 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            // upper side
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // lower side

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n * 2 - (2 * i + 1); k++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


//    *   
//   ***  
//  ***** 
// *******
//  *****  
//   ***   
//    * 