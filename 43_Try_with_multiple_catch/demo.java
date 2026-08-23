
public class demo {
    public static void main(String[] args) {
        //try with multiple catch blocks
        //Exception handles every exception but it is not recommended to use it because it can hide the actual exception and make it difficult to debug the code. 
        // It is better to catch specific exceptions and handle them accordingly.
        try {
            int arr[] = new int[3];

            arr[5] = 10;        // This will cause ArrayIndexOutOfBoundsException

            int x = 10 / 0;     // This will cause ArithmeticException

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        } 
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("Program continues...");
    }    
}
