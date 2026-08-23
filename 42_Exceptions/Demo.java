
//exceptions are events that occur during the execution of a program that disrupt the normal flow of instructions. 
// They can be caused by various factors such as invalid user input, file not found, division by zero, etc. 
// In Java, exceptions are handled using try-catch blocks, which allow developers to gracefully handle errors and prevent crashes.
public class Demo {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j = 17/i; // this will throw an ArithmeticException because division by zero is not allowed 
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println();
    }
}
