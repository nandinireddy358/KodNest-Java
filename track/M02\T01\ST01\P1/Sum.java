
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter array elements");
        for (int i = 1; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of array elements:" + sum);
        int max = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max element is:" + max);
    }
}
