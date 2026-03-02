public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mrs. Smith");
        t.addStudent(new Student("Alice"));
        t.addStudent(new Student("Bob"));

        t.printStudents();
    }
}