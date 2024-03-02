package BasicRecursion;

public class basic_rec {
    int count = 0; 
    void f(){
        if(count == 5){
            return; 
        }
        System.out.println(count);
        count++; 
        f(); 
    }
    public static void main(String[] args) {
        basic_rec b1 = new basic_rec(); 

        b1.f();
    }
}
