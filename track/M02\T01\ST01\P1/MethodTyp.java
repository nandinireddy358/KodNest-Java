
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        // Print the fixed message
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        // Print the greeting
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        // Return 7
        System.out.println("Lucky Number: 7");
        return 7;
    }

    int add(int a, int b) {
        // Return the sum
        System.out.print("Sum: ");
        System.out.println(a + b);
        return a + b;
    }
}

public class MethodTyp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the name and two numbers
        String name = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Create one object
        MethodDemo obj = new MethodDemo();
        // Call all four methods
        obj.sayHello();
        obj.greet(name);
        obj.getLuckyNumber();
        obj.add(a, b);
    }
}
