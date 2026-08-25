
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        // Store the parameter in the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Initialize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name
        String name = scanner.nextLine();
        // Create one Student object
        Student obj = new Student(name);
        // Call display()
        obj.display();
    }
}
