package Practice;
class bike{
    void run(){
        System.out.println("bike is running ");
    }
}

class bike2 extends bike{
    void run(){
        System.out.println(" BIKE TWO IS RUNNING ");
    }
}

public class inheritance {
    public static void main(String args[]){
        bike2 b1 = new bike2(); 
        b1.run(); 
    }
}
