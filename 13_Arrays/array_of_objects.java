class Student {
    int id;
    String name;
}

public class array_of_objects {
    public static void main(String[] args) {
        // Create array of Student objects
        Student[] arr = new Student[3];

        // Create objects and assign to array
        arr[0] = new Student();
        arr[0].id = 1;
        arr[0].name = "Amit";

        arr[1] = new Student();
        arr[1].id = 2;
        arr[1].name = "Rahul";

        arr[2] = new Student();
        arr[2].id = 3;
        arr[2].name = "Neha";

        // Print array of objects
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].id + " " + arr[i].name);
        }
    }
}
