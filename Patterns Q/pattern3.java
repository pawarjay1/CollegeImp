// input : n = 5

// result : 
// 1
// 12
// 123
// 1234
// 12345

public class pattern3 {

    public static void pattern_3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int n = 5;
        pattern_3(n);
    }
}
