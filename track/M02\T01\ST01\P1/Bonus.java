
public class Bonus {

    public static void main(String[] args) {
        // Write your code here.
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;
        int update = values[0];
        System.out.print("Updated values: ");
        for (int i = 0; i <= values.length - 1; i++) {
            update = values[i] + bonus;
            System.out.print(update + " ");
        }
    }
}
