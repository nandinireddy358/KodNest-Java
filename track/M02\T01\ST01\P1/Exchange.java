
import java.util.Scanner;

public class Exchange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int element = sc.nextInt();
        int index = 2;
        int b[] = new int[index];
        for (int i = 0; i < index; i++) {
            arr[i] = sc.nextInt();
            b[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            b[i + 1] = arr[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
