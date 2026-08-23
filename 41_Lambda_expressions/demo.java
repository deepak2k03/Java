@FunctionalInterface
interface A {
    void show(); // this will cause a compilation error because a functional interface can have only one abstract method
}


public class demo {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Welcome");
            }
        };

        
        //lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method. They are used primarily to define inline implementations of functional interfaces, which are interfaces with a single abstract method.
        // lambda expressions only work with functional interfaces because they provide a clear target for the lambda expression to implement. The single abstract method in the functional interface serves as the contract that the lambda expression must fulfill, allowing the compiler to infer the types of the parameters and the return value based on the context in which the lambda expression is used.
        A obj2 = () -> System.out.println("Hello");

        //the above line can also be written as:
        //A obj2 = () -> {
        //    System.out.println("Hello");
        //};

        obj.show(); // prints "Welcome"
        obj2.show(); // prints "Hello"
    }
}
