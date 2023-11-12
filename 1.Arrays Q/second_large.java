public class second_large {

    public static void second_largest_elment(int a[], int n) {
        int large = a[0];
        int second_large = -1; // we return -1 if the array does not exist an second largest

        for (int i = 1; i < n; i++) {
            if (a[i] > large) { // if this happend than store the largest to second largest
                second_large = large;
                large = a[i];
            } else if (a[i] < large && a[i] > second_large) { // if both condition true than second large will chaenge
                                                              // else not
                second_large = a[i];
            }
        }

        System.out.println("second large : " + second_large);
    }

    public static void main(String args[]) {
        // int n = 5;
        // int a[] = new int[n];

        // a[0] = 3;
        // a[1] = 1;
        // a[2] = 4;
        // a[3] = 7;
        // a[4] = 7;

        int a[] = {1,2,3,4,5,6,6}; 

        int n = a.length; 

        second_largest_elment(a, n);

    }
}

// *****brute force approuch

// 1. first sort the array
// 2. The element present at the second index is the second smallest element
// 3. The element present at the second index from the end is the second largest
// element
// Time Complexity: O(NlogN) becouse of sorting the array

// *****better solution approuch

// *****optimal solution approuch
