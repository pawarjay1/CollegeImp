package BasicMaths;

public class digit {
    public static void main(String args[]){
        int n = 12345; 
        int num,counter=0; 
        while(n>0){
            num = n%10; 
            num/=10; 
            counter++; 
        }
        System.out.println(counter);
    }
}
