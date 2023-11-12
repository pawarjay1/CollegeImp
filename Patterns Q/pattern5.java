public class pattern5 {
    public static void pattern_5(int n) {

        for (int i = 1; i <= n; i++) {
            // for(int j=n; j>i; j--){
            // System.out.print("* ");
            // }

            // the formula is (N-i+1)
            
            for (int j = 0; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int n = 5;
        pattern_5(n);
    }
}

// input : 5

// result :

// *****
// ****
// ***
// **
// *