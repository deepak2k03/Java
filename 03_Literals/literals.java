class literals {
    public static void main(String[] args) {

        // 1. Integer literals
        int decimal = 10;
        int binary  = 0b1010;
        int octal   = 012;
        int hex     = 0xA;

        // 2. Floating-point literals
        float f = 10.5f;
        double d = 3.14;
        double d2 = 1_00_000.50;

        // 3. Character literals
        char ch1 = 'A';
        char ch2 = '\n';
        char ch3 = '\u0041';

        // 4. String literals
        String str1 = "Hello Java";
        String str2 = "";

        // 5. Boolean literals
        boolean b1 = true;
        boolean b2 = false;

        // 6. null literal
        String ref = null;

        // Output
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);

        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Double with underscore: " + d2);

        System.out.println("Char A: " + ch1);
        System.out.println("New Line char prints next line");
        System.out.print(ch2);
        System.out.println("Unicode char: " + ch3);

        System.out.println("String: " + str1);
        System.out.println("Empty String: " + str2);

        System.out.println("Boolean true: " + b1);
        System.out.println("Boolean false: " + b2);

        System.out.println("Null reference: " + ref);
    }
}
