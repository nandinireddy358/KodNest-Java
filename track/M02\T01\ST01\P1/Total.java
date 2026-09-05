import java.util.Scanner;

class ResultCalculator {
    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        ResultCalculator obj = new ResultCalculator();

        int total1 = obj.getTotal(first, second);
        int total2 = obj.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + total1);
        System.out.println("Three-Mark Total: " + total2);

        scanner.close();
    }
}
