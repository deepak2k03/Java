public class jagged_array {
    public static void main(String[] args) {
        // Declare a jagged array
        int[][] arr = new int[3][];

        // Initialize rows with different sizes
        arr[0] = new int[2]; // row 0 has 2 elements
        arr[1] = new int[4]; // row 1 has 4 elements
        arr[2] = new int[3]; // row 2 has 3 elements

        // Assign values
        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        arr[1][3] = 6;

        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        // Print jagged array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
