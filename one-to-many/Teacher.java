import java.util.ArrayList;
import java.util.List;

// "One" class
public class Teacher {
    String name;
    List<Student> students = new ArrayList<>(); // One-to-many relationship

    public Teacher(String name) {
        this.name = name;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printStudents() {
        System.out.println("Students of " + name + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}