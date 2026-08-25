
public class TraceArray {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;
        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        for (int i = 0; i < snapshot.length; i++) {
            snapshot[i] = original[i];
        }
        int[] liveView = original;
        // Update through liveView.
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }
        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int x : original) {
            System.out.print(x + " ");
        }

        System.out.print("\nSnapshot: ");
        for (int x : snapshot) {
            System.out.print(x + " ");
        }

        System.out.println("\nSame object: " + (original == liveView));

        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]); 
        }else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
// Validate requestedIndex before accessing original.

