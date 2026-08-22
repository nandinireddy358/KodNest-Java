
import java.util.Scanner;

class Student {

    int regId;
    String name;
    double attendancePercentage;
}

public class StdRegObj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student first = new Student();
        Student second = new Student();

        // First student
        first.regId = scanner.nextInt();
        first.name = scanner.next();
        first.attendancePercentage = scanner.nextDouble();

        // Second student
        second.regId = scanner.nextInt();
        second.name = scanner.next();
        second.attendancePercentage = scanner.nextDouble();

        // Registration ID to select
        int searchId = scanner.nextInt();
        double attendance = scanner.nextDouble();
        // Refer to the matching existing object
        Student selectedStudent = null;

        if (first.regId == searchId) {
            selectedStudent = first;
            first.attendancePercentage = attendance;
        } else if (second.regId == searchId) {
            selectedStudent = second;
            second.attendancePercentage = attendance;
        }

        // Output
        if (selectedStudent != null) {
            System.out.println("Selected Student: " + selectedStudent.name);

            System.out.println(first.regId + " - " + first.name + " - " + first.attendancePercentage + "%");
            System.out.println(second.regId + " - " + second.name + " - " + second.attendancePercentage + "%");
        } else {
            System.out.println("Student not found.");
            System.out.println(first.regId + " - " + first.name + " - " + first.attendancePercentage + "%");
            System.out.println(second.regId + " - " + second.name + " - " + second.attendancePercentage + "%");
        }
    }
}
