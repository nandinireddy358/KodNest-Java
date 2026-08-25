
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class StuUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentUtility utility = new StudentUtility();

        // Read input
        int id = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        // Display report
        utility.showReportTitle();
        utility.displayStudent(id, name);

        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();

        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + (percentage >= passingPercentage ? "PASS" : "NEEDS IMPROVEMENT"));

        scanner.close();
    }
}
