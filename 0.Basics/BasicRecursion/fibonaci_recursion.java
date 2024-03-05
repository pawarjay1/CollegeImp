package BasicRecursion;

public class fibonaci_recursion {
    static int f(int n){
        if(n<=1) return n; 

        // multiple recursion call
        int last = f(n-1); 
        int slast = f(n-2); 

        return last+slast; 
    }
    public static void main(String args[]){
        int n = 4; 
        System.out.println(f(n));
    }
}
