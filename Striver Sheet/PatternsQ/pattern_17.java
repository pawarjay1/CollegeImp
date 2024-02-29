package PatternsQ;

public class pattern_17 {
    public static void main(String[] args) {
        int n=5; 
        for(int i=1; i<=n; i++){
            // space 
            for(int j=1; j<n-i+1; j++){
                System.out.print("-");
            }
            for(char ch='A'; ch<'A'+(i*2-1); ch++){
                System.out.print(ch);
            }
            // space  
            for(int j=1; j<n-i+1; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}

// ----A----
// ---ABC---
// --ABCDE--
// -ABCDEFG-
// ABCDEFGHI
