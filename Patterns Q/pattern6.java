public class pattern6 {
    public static void pattern_6(int n) {

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" "); 
            }
            System.out.println(); 
        }
    }

    public static void main(String args[]) {

        int n = 5;
        pattern_6(n);
    } 
}


// input : 5

// result : 

// 12345
// 1234
// 123
// 12
// 1