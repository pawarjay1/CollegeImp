package BasicMaths;

public class digit_count {
    public static void main(String args[]){
        int n=7789;
        int counter=0; 
        while(n>0){
            n/=10; 
            counter++; 
        }
        System.out.println(counter);
    }
}
