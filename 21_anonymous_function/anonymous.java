class Test {
    void show() {
        System.out.println("Hello from anonymous object");
    }
}
public class anonymous {
    //An anonymous object is an object created without storing it in a reference variable.
    public static void main(String[] args) {
        new Test().show();   // anonymous object
        //u cant use this object again
    }
}
