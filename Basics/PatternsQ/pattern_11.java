package PatternsQ;
public class pattern_11 {
    public static void main(String[] args) {
        int n = 5; 

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            // space  
            for(int k=1; k<2*n-(i*2-1); k++){
                System.out.print("-");
            }

            for(int j=i; j>=1; j--){  
                System.out.print(j);
            }

            System.out.println();
        }
    }
}

// 1--------1
// 12------21
// 123----321
// 1234--4321
// 1234554321