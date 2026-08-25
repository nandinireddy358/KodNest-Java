
public class Mutation {

    public static void main(String[] args) {
        // Write your code here.
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;
        System.out.print("Snapshot: ");
        for (int i = 0; i <= readings.length - 1; i++) {
            int snapshot = readings[i];
            System.out.print(snapshot + " ");
        }
        System.out.println();
        readings[updateIndex] = newValue;
        System.out.print("Updated: ");
        for (int i = 0; i <= readings.length - 1; i++) {
            int update = readings[i];
            System.out.print(update + " ");
        }
    }
}
