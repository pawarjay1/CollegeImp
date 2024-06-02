package Practice.oop_practice;    
class bike{
    String color = "red"; 
}

class bike2 extends bike{
    String color = "wheight"; 
    /**
     * 
     */
    void run(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class inheritance {
    public static void main(String args[]){
        bike2 b1 = new bike2(); 
        b1.run(); 
    }
}
