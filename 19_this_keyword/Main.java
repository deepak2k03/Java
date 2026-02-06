class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;       // instance variable
        this.name = name;   // instance variable
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        s1.display();
    }
}
