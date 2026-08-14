
import java.util.Scanner;

public class InputwithConLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int total = 0;

        for (int i = 0; i < days; i++) {
            total += scanner.nextInt();
        }

        System.out.println("Total solved: " + total);
        if (total >= 20) {
            System.out.println("Status: Strong progress");
        } else if (total >= 10 && total <= 19) {
            System.out.println("Status: Keep Going");
        } else {
            System.out.println("Status: Need more practice");
        }
        scanner.close();
    }
}
