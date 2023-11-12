public class pattern10 {
    public static void pattern_10(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;

            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int n = 3;
        pattern_10(n);
    }
}

// input : 3

// result :

// *
// **
// ***
// **
// *