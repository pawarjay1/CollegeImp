class A{
    void run(){
        System.out.println("run");
    }
}
class B extends A{
    void run(){
        System.out.println("run2");
        super.run();
    }
    
}

public class pra_1 {
    public static void main(String args[]){
        B b1 = new B();
        b1.run();
    }
}
