package BasicRecursion;

public class reverse_array {
    static void array_reverse(int arr[],int start,int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end]; 
            arr[end] = temp; 

            array_reverse(arr,start+1,end-1);
        }
    }

    static void print_array(int arr[],int n){

        System.out.println("the reverse array is : ");

        for(int i=0; i<n; i++){
            
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50}; 
        int n = arr.length; 

        array_reverse(arr,0,n-1); 
        print_array(arr,n); 
    }
}
