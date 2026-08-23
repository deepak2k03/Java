class AgeTooSmallException extends Exception {

    AgeTooSmallException(String message) {
        super(message);
    }

}
public class demo {

    static void checkAge(int age) throws AgeTooSmallException {

        if (age < 18) {
            throw new AgeTooSmallException("Age must be 18 or above");
        }

        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);              // Custom Exception

            int x = 10 / 0;            // Arithmetic Exception

        }
        catch (AgeTooSmallException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("Program continues...");
    }
}