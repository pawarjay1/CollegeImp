package BasicMaths;

public class armstrong {
    static void armstrong_num(int n){
        int duplicate=n; 
        int last_digit;
        int sum = 0;  
        while(n>0){
            last_digit=n%10; 
            sum = sum + (last_digit*last_digit*last_digit); 
            n/=10; 
        }
        if(duplicate==sum){
            System.out.println("number is armstrong!");
        }else{
            System.out.println("number is not armstrong!");
        }
        
    }
    public static void main(String args[]){
        int n=153;
        armstrong_num(n);
    }
}
