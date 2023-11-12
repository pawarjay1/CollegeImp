public class remove_dublicate {
    public static void main(String args[]){
        int arr[] = {1,1,2,2,3,3}; 

        int i = 0; 

        for(int j=0; j<5; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j]; //assign next elment to empty space
                i=i+1; 
            }
        }

        for(int a=0; a<arr.length; a++){
            System.out.println(arr[i]);
        }
    }
}
