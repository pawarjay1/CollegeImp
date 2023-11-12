public class check_arr_shorted_or_not {
    public static void main(String args[]) {
        int n = 5;
        int a[] = new int[n];

        a[0] = 3;
        a[1] = 1;
        a[2] = 4;
        a[3] = 5;
        a[4] = 2;

        for(int i=1; i<n; i++){
            if(a[i]<a[i-1]){
                // return false; 
                System.out.println("not sorted "); 
            }
        }
        // return true; 
        System.out.println("sorted!!! ");
    }
}

// check the array is sorted or not 

// approuch

// 1. asume first element as a largest 
// 2. check that number with next elment if it is lesser than return false else return true 
