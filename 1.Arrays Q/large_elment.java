public class large_elment {
    public static void main(String args[]) {
        int n = 5;
        int a[] = new int[n];

        a[0] = 3;
        a[1] = 1;
        a[2] = 4;
        a[3] = 5;
        a[4] = 2;

        int largest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        System.out.println("largest is : " + largest);
    }
}
// *****brute force approuch

// 1. sort the array than
// 2. print the last element of array. (N-1)  
// Time Complexity: O(N*log(N))


// *****optimal solution approuch

// 1. asume the first element is large
// 2. than compair with others and if large number found than set large
// 3. print the largest number
// Time Complexity: O(N) 