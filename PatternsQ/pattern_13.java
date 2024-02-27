package PatternsQ;

public class pattern_13 {
    public static void main(String[] args) {
        int n = 5;
        int star; 
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                star = 1; 
            } else {
                star = 0; 
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(star);
                star = 1-star; 
            }
            System.out.println();
        }
    }
}
