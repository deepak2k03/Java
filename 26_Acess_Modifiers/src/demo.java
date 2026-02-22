import others.*;

public class demo {
    public static void main(String[] args) {
        A obj = new A();
        B obj2 = new B();
        System.out.println(obj.x);
        System.out.println(obj2.y); // no problem for same package 
    }
}
