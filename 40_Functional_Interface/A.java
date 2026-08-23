@FunctionalInterface
public interface A {
    void show(); // this will cause a compilation error because a functional interface can have only one abstract method
}

class B implements A {
    public void show() {
        System.out.println("Hello");
    }
    
    public void display() { // this method is not abstract, so it does not violate the functional interface contract
        System.out.println("Welcome");
    }
}
public class demo {
    public static void main(String[] args) {
        
    }
}
