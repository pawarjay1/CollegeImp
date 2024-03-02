package BasicRecursion;

public class print_name_n_time {

    static void print(int i,int n){
        if(i>n){
            return; 
        }
        System.out.println("jay");
        print(i+1,n);
    }
    public static void main(String[] args) {
        int n=6; 
        print(1,n); 
    }
}
