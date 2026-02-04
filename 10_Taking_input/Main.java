import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();        // integer
        double b = sc.nextDouble(); // decimal
        String s = sc.next();       // single word
        String line = sc.nextLine();// full line

        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        System.out.println(line);
        sc.close();
    }
}
