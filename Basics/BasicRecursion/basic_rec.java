// print number from 1 to N 

package BasicRecursion;

public class basic_rec {
    // int count = 0;

    void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        // count++;
        f(i + 1, n);
    }

    public static void main(String[] args) {
        basic_rec b1 = new basic_rec();
        int n = 10;
        b1.f(1, n);
    }
}
