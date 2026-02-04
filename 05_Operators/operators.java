class operators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println(a + b);  // +
        System.out.println(a - b);  // -
        System.out.println(a * b);  // *
        System.out.println(a / b);  // /
        System.out.println(a % b);  // %

        // 2. Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 5;
        System.out.println(+x);     // unary +
        System.out.println(-x);     // unary -
        System.out.println(++x);    // pre-increment
        System.out.println(--x);    // pre-decrement

        // 3. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // 4. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean p = true, q = false;
        System.out.println(p && q); // AND
        System.out.println(p || q); // OR
        System.out.println(!p);     // NOT

        // 5. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int m = 5, n = 3;
        System.out.println(m & n);  // AND
        System.out.println(m | n);  // OR
        System.out.println(m ^ n);  // XOR
        System.out.println(~m);     // NOT

        // 6. Shift Operators
        System.out.println("\nShift Operators:");
        System.out.println(m << 1); // Left shift
        System.out.println(m >> 1); // Right shift
        System.out.println(m >>> 1);// Unsigned right shift

        // 7. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int z = 10;
        z += 5;
        z -= 3;
        z *= 2;
        z /= 4;
        System.out.println(z);

        // 8. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        // 9. instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String s = "Java";
        System.out.println(s instanceof String);
    }
}
