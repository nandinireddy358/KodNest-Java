
import java.util.Scanner;

public class Checkpoint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array
        int size = sc.nextInt();
        int[] arr = new int[size];

        int arrayTotal = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            arrayTotal += arr[i];
        }

        // Read matrix
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        int matrixTotal = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }

        System.out.println("Array total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
    }
}
