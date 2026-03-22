class A{
    public void show(){
        System.out.println("Hello");
    }
}
public class demo {
    public static void main(String[] args) {
        
        A obj = new A(){
            public void show(){
                System.out.println("Welcome");
            }
        };
        obj.show(); // prints "Welcome" instead of "Hello"
    }        
}
