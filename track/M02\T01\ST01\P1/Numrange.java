
import java.util.Scanner;

class Numrange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                count += 1;
            }
        }
        System.out.println("Even sum: " + sum);
        System.out.println("Odd count:" + count);
        sc.close();
    }
}
