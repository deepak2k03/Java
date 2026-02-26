//In Java, wrapper classes are classes that convert primitive data types into objects.

class demo{
    public static void main(String[] args) {
        int a = 5;              // primitive
        Integer b = a;          // wrapper class object (autoboxing)

        System.out.println(a);  // prints 5
        System.out.println(b);  // prints 5
    }
}