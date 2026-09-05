
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int temp = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            right = temp;
            left++;
            right--;
        }
        System.out.println(arr);
    }
}
