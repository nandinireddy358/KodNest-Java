
import java.util.Scanner;

class Learner {

    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;
}

public class LearProObj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Learner object
        Learner frst = new Learner();
        frst.id = scanner.nextInt();
        scanner.nextLine();
        frst.name = scanner.nextLine();
        frst.javaScore = scanner.nextInt();

        // Create and populate the second Learner object
        Learner sec = new Learner();
        sec.id = scanner.nextInt();
        scanner.nextLine();
        sec.name = scanner.nextLine();
        sec.javaScore = scanner.nextInt();

        // Read the new score
        int newscore = scanner.nextInt();
        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(frst.id + " - " + frst.name + " - " + frst.javaScore);
        System.out.println(sec.id + " - " + sec.name + " - " + sec.javaScore);
        // Update only the first object
        frst.javaScore = newscore;
        // Display both records after the update
        System.out.println("After Update");
        System.out.println(frst.id + " - " + frst.name + " - " + frst.javaScore);
        System.out.println(sec.id + " - " + sec.name + " - " + sec.javaScore);
    }
}
