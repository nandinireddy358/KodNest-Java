
import java.util.Scanner;

public class Com2obj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student frst = new Student();

        // Create and populate the second Student object
        Student sec = new Student();

        // Display both records
        frst.id = scanner.nextInt();
        scanner.nextLine();
        frst.name = scanner.nextLine();
        frst.javaScore = scanner.nextInt();
        sec.id = scanner.nextInt();
        scanner.nextLine();
        sec.name = scanner.nextLine();
        sec.javaScore = scanner.nextInt();

        // Compare both scores and print one result
        System.out.println(frst.id + " - " + frst.name + " - " + frst.javaScore);
        System.out.println(sec.id + " - " + sec.name + " - " + sec.javaScore);
        if (frst.javaScore > sec.javaScore) {
            System.out.println(frst.name + " has the higher Java score.");
        } else if (sec.javaScore > frst.javaScore) {
            System.out.println(sec.name + " has the higher Java score.");
        } else {
            System.out.println("Both students have the same Java score.");
        }
    }
}
