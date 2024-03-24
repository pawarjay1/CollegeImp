package Practice.oop_practice;

class boy{
    String name; 
    int age; 
    boy(){
        
    }
    boy(boy b1){
        System.out.println("constructor is initilized!");
        this.name = b1.name; 
        this.age = b1.age; 
    }

    void show(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class constructor {
    public static void main(String[] args) {
        boy b1 = new boy(); 
        b1.name = "jay"; 
        b1.age=21; 

        boy b2 = new boy(b1); 

        b2.show(); 
    }
}
