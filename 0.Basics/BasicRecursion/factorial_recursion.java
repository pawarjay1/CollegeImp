package BasicRecursion;

public class factorial_recursion {
    static int f(int n) {
        if (n <= 1)
            return n;

        return n * f(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(f(n));
    }
}
