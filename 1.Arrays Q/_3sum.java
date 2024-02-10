
class _3sum{

    int target_fn(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=i+2; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        //System.out.println("target is found at "+arr[i]+","+arr[j]+","+arr[k]); 
                        return {i,j,k}; 
                    }
                }
            }
        }
        return int[] {i,j,k};  
    }
    public static void main(String args[]){
        int arr[] = {12,3,4,1,6,9}; 
        int target = 24;
        
        _3sum s1 = new _3sum(); 
        s1.target_fn(arr,target); 
    }
}