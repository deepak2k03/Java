// you cant create object of abstract class
abstract class car{
    public abstract void drive();
    public void f(){
        System.out.println("Hi");
    }
}

class bmw extends car{
    public void drive(){
        System.out.println("Lets drive");
    }
}

public class demo {
    public static void main(String[] args) {
        bmw obj = new bmw();
        obj.drive();
    }    
}
