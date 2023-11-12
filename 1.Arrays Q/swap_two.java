public class swap_two {
    public static void swap(int a,int b){
        int temp; 
        temp = a; 
        a = b; 
        b = temp; 

        System.out.println("a : "+a+"b : "+b);
    }
    public static void main(String args[]){
        int a = 10; 
        int b = 20; 

        swap(a,b);
    }
}
