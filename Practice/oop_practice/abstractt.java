package Practice.oop_practice;

abstract class A{
    public abstract void run(); 

}
class B extends A{
    public void run(){
        System.out.println("abstract class A is running in B");
    }
}

public class abstractt {
    public static void main(String args[]){
        B b1 = new B(); 
        b1.run(); 
    }
}
