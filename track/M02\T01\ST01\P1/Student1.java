
import java.util.Scanner;

public class Student1 {

    int id;
    String name;
    String course;
    double javaScore;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student1 val = new Student1();

        val.id = scanner.nextInt();
        scanner.nextLine();

        val.name = scanner.nextLine();
        val.course = scanner.nextLine();
        val.javaScore = scanner.nextDouble();

        System.out.println("Student Profile ");
        System.out.println("ID: " + val.id);
        System.out.println("Name: " + val.name);
        System.out.println("Course: " + val.course);
        System.out.println("Java Score: " + val.javaScore);
    }
}
