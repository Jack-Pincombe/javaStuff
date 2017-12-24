


class Animal {
    public void move(){
        System.out.println("run");
    }
}

class dog extends Animal{
    public void move(){
        System.out.println("sprint");
    }
         
}

public class TestDog{
    public static void main(String[], args[]){
        
    Animal a = new Animal();
    Animal b = new dog();
    
    a.move();
    b.move();
    }
}
