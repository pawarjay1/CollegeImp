package collage.practical1;

import java.util.Scanner;

public class prac_9 {
    public static long addOneToDigits(long number) {
        long result = 0;
        long placevalue = 1;

        while (number > 0) {
            long digit = number % 10;
            result += (digit + 1) * placevalue;
            number /= 10;
            placevalue *= 10;

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.print("Enter the five digits : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long result = addOneToDigits(num);

        System.out.println("added 1 to each number is : " + result);
        sc.close();
    }
}

// smaple output

// 54321 --> 65432
