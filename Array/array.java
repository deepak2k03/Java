
import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int []marks = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        for (int idx = 0; idx < marks.length; idx++) {
            System.out.println("Enter the marks of student "+ idx);
            marks[idx]=scan.nextInt(); 
        }
        for (int idx = 0; idx < marks.length; idx++) {
            System.out.println(marks[idx]);
        }
    }
}