package Practice.oop_practice;

class boy{
    int id; 
    String name; 

    boy(int id,String name){
        this.id = id; 
        this.name = name; 
    }

    boy(boy b1){
        this.id = b1.id; 
        this.name = b1.name; 
    }

    void show(){
        System.out.println(id);
        System.out.println(name);
    }
}

public class constructor {
    public static void main(String[] args) {
         boy b = new boy(10,"jay"); 
         boy b1 = new boy(b);
    }
}
