public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 85.5);
        Student s2 = new Student(102, "Bob", 92.0);

        s1.displayDetails();
        s2.displayDetails();
    }
}
