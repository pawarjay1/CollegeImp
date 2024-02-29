package PatternsQ;

public class pattern_20 {
    public static void main(String args[]){
        int n=5;
         
        for(int i=0; i<n*2-1; i++){
            int star=i; 
            
            if(i>n) star = 2*n-i; 
            // space 
            for(int j=0; j<=star; j++){
                System.out.print("*");
            }

            for(int k=0; k<2*n-1; k++){
                System.out.print("-");
            }
            

            // space 
            for(int j=0; j<=star; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
