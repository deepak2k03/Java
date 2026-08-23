@Deprecated // this annotation indicates that the marked element is deprecated and should no longer be used. It serves as a warning to developers that the element may be removed in future versions.
class A{
    public void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    @Override // this annotation indicates that the method is intended to override a method in the superclass
    public void show(){
        System.out.println("in B show");
    }
}

public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); // prints "in B show" instead of "in A show"
    }    
}
