package Practice.oop_practice;
class copy_cons{
    int id; 
    String name; 
    copy_cons(int id,String name){
        this.id = id; 
        this.name = name; 
    }

    copy_cons(copy_cons d1){
        this.id = d1.id; 
        this.name = d1.name; 
    }

    void display(){
        System.out.println(id+" "+name); 
    }
    public static void main(String args[]){
        copy_cons c1 = new copy_cons(21,"jay"); 
        copy_cons c2 = new copy_cons(c1); 

        c1.display(); 
        c2.display(); 
    }
}