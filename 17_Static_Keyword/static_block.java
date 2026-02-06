public class static_block {
    static {
        System.out.println("Static block executed");
    }
    public static void main(String[] args) {
        
        /*
        A static block is a block of code inside a class that runs automatically when the class is loaded into memory, before:
        main() runs any object of the class is created
        It’s mainly used for one-time initialization of static variables.
        */

    }
}
