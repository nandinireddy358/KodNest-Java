
import java.util.Scanner;

class Student {

    String name;

    void setName(String n) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class StoringUsingThis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student student = new Student();
        student.setName(name);
        student.displayName();

        scanner.close();
    }
}
