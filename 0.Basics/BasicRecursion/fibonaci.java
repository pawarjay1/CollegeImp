package BasicRecursion;

// fibonaci series without recursion 

public class fibonaci {
    public static void main(String args[]) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int num = 0;
        while (num < 10) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;

            num++; 

        }
    }
}
