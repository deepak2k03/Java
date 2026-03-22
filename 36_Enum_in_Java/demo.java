//enum is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
// enum is a class but you cannot extend it with other class.
enum Status{
    //these are the predefined constants for the enum Status
    Running, Completed, Failed
}
public class demo {
    public static void main(String[] args) {
        Status s1 = Status.Running;
        Status s2 = Status.Completed;
        System.out.println(s1.ordinal()); // prints the ordinal value of s1, which is 0
        System.out.println(s1); // prints "Running"
        System.out.println(s2.ordinal());// prints the ordinal value of s2, which is 1
        System.out.println(s2); // prints "Completed"

    }
}
