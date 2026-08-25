
import java.util.Scanner;

public class Runtime {

    public static void main(String[] args) {
        // Write your code here.
        int a[] = new int[5];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= a.length - 1; i++) {
            total += a[i];
        }
        System.out.println("Total: " + total);
    }
}
