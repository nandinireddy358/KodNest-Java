
import java.util.Scanner;

class Interactivelearner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namme = sc.nextLine();
        int count = sc.nextInt();
        int total = 0;
        double avg = 0;
        for (int i = 1; i <= count; i++) {
            int practice = sc.nextInt();
            total += practice;
        }
        avg = total / count;
        System.out.println("name:" + namme);
        System.out.println("practice problems solved:" + count);
        System.out.println("avg practice problems solved per day:" + avg);
        if (avg > 4) {
            System.out.println("Great Job!");
        } else {
            System.out.println("Keep Practicing!");
        }
        sc.close();
    }
}
