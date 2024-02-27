package PatternsQ;

public class pattern_16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            char ch = 'A'; 
            for (int j=0; j<=i; j++) {
                System.out.print((char)(int)(ch+i));
            }
            System.out.println();
        }
    }
}

// A
// BB
// CCC
// DDDD
// EEEEE
