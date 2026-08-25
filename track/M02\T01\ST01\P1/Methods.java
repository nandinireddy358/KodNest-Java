
import java.util.Scanner;

class Printer {

    void show(int number) {
        // Print the number
        System.out.println("Number: " + number);
    }

    void show(String word) {
        // Print the word
        System.out.println("Word: " + word);
    }
}

public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        String word = scanner.nextLine();
        // Read one number and one word
        Printer print = new Printer();
        // Create one Printer object
        print.show(number);
        print.show(word);
        // Call both show() methods
    }
}
