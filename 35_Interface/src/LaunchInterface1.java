interface calc{
    //by default all the methods in interface are public and abstract
    void add(int a, int b); //bts -> public abstract void add(int a, int b); 
    void sub(int a, int b); //bts -> public abstract void sub(int a, int b);
}

class Mycalc1 implements calc{
    // we have to override all the methods of interface in the class which implements the interface otherwise we have to declare the class as abstract class 
    public void add(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
    public void sub(int a, int b){
        System.out.println("The difference is: " + (a-b));
    }
}

class Mycalc2 implements calc{
    public void add(int a, int b){
        int n1=a;
        int n2=b;
        int res=n1+n2;
        System.out.println("The sum is: " + res);
    }
    public void sub(int a, int b){
        int n1=a;
        int n2=b;
        int res=n1-n2;
        System.out.println("The difference is: " + res);
    }
    
}

public class LaunchInterface1 {
    public static void main(String[] args) {
        calc calc1 = new Mycalc1();
        calc1.add(4,5);
        calc1.sub(4,5);
        calc calc2 = new Mycalc2() ;
        calc2.add(4,5);
        calc2.sub(4,5); 
    }
}
