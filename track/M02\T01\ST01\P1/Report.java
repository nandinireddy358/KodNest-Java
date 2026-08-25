
public class Report {

    public static void main(String[] args) {
        // Write your code here.
        int[] stock = {4, 12, 2, 9, 5};
        int reorderLevel = 5;
        int count = 0;
        for (int i = 0; i <= stock.length - 1; i++) {
            if (stock[i] <= reorderLevel) {
                count++;
            }
        }
        System.out.println("Items to reorder: " + count);
    }
}
