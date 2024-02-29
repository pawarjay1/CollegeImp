package collage.practical1;
import java.util.*; 


public class prac_10 {
    public static void main(String[] args) {

        double area = 0,s=0; 

        System.out.println("Enter three sides of triangle!");

        System.out.println("Enter first Number :");
        Scanner sc1 = new Scanner(System.in); 
        float a = sc1.nextFloat(); 

        System.out.println("Enter second Number :");
        Scanner sc2 = new Scanner(System.in); 
        float b = sc2.nextFloat(); 

        System.out.println("Enter second Number :");
        Scanner sc3 = new Scanner(System.in); 
        float c = sc3.nextFloat(); 

        s = (a+b+c)/2; 
        area = Math.sqrt(s*(s-1)*(s-b)*(s-c)); 

        System.out.print("the area of trangle is : "+area);


        sc1.close();
        sc2.close(); 
        sc3.close(); 
    }
}
