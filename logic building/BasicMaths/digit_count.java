package BasicMaths;

public class digit_count {

    static int counter_func(int n){
        int counter=0; 
        while(n>0){
            n=n/10; 
            counter++; 
        }
        return counter; 
    }
    public static void main(String args[]){
        int n=7789;
        System.out.println("counter : "+counter_func(n));
    }
}
