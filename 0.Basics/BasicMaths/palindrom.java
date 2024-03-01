package BasicMaths;

public class palindrom {

    static void palindrom_num(int n) {

        int dublicate = n; 
        int rev = 0;
        int last_digit;
        while (n > 0) {
            last_digit = n % 10;
            n = n / 10;

            rev = (rev * 10) + last_digit;

        }

        if (dublicate == rev) {
            System.out.println("number is palindrom!");
        } else {
            System.out.println("number is not palindrom!");
        }

    }

    public static void main(String args[]) {
        int n = 111;
        palindrom_num(n);
    }
}
