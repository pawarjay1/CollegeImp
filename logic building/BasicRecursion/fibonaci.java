package BasicRecursion;
import java.util.Scanner; 
// fibonaci series without recursion 

public class fibonaci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number : ");
        int a=sc.nextInt(); 
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        int num = 0;
        while (num < a) {
            int n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;

            num++; 

        }

        sc.close(); 
    }
}
