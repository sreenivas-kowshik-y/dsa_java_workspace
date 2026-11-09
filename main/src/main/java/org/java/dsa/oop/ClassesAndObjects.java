// Demonstrating Classes, Objects, Constructors, and 'this' Keyword
public class ClassesAndObjects {

    static class Student {
        int rno;
        String name;
        float marks;

        // Default Constructor
        Student() {
            this(0, "Default Student", 0.0f);
        }

        // Parameterized Constructor
        Student(int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        void displayInfo() {
            System.out.println("Roll No: " + this.rno + ", Name: " + this.name + ", Marks: " + this.marks);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Kowshik", 95.5f);

        s1.displayInfo();
        s2.displayInfo();
    }
}
