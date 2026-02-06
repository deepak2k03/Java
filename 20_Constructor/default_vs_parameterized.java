class Student {
    int id;
    String name;

    // Constructor 1
    Student() {
        System.out.println("Default constructor");
    }

    // Constructor 2
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
public class default_vs_parameterized {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "John");

        s2.display();
    }
}
