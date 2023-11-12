public class pattern4 {
    public static void pattern_4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");

                // i used this approuch but does't work

                // for(int k=1; k<=j; k++){
                // System.out.print(" "+k);
                // }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int n = 5;
        pattern_4(n);
    }
}

// input : 5

// result :

// 1
// 22
// 333
// 4444
// 55555