public class demo {
    public static void main(String[] args) {
        //throw keyword is used to explicitly throw an exception from a method or a block of code. 
        // It is followed by an instance of the Throwable class or its subclasses, which represents the exception that is being thrown.
        try {
            int a = 10;
            int b = 0;
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed"); // throwing an exception with a custom message
            }
            int c = a / b; // this line will not be executed because the exception is thrown before it
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage()); // handling the exception and printing the custom message
        }
    }
}
