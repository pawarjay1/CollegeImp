package BasicMaths;

public class revirse_num {

    static int riv_num(int n){
        // int counter=0;
        int rev=0;  
        int last_digit; 
        while(n>0){
            last_digit= n%10; 
            n=n/10; 
            // counter++;
            rev=(rev*10)+last_digit;

        }
        return rev; 
    }
    public static void main(String args[]){
        int n=7789;
        System.out.println("counter : "+riv_num(n));
    }
}
