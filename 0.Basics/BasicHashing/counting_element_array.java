package BasicHashing;

public class counting_element_array {
    static void f(int arr[],int n){
        int count = 0; 
        for(int i=0; i<arr.length; i++){

            if(arr[i] == n){
                count++; 
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        int arr[]={1,2,2,4,1};  
        int n = 4; 
        f(arr,n); 
    }
}
