class Student {
    // private data members (data hiding)
    private String name;
    private int age;

    // public getter
    public String getName() {
        return name;
    }

    // public setter
    public void setName(String name) {
        this.name = name;
    }

    // public getter
    public int getAge() {
        return age;
    }

    // public setter with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("John");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
