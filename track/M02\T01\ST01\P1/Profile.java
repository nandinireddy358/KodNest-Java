
import java.util.Scanner;

class Profile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int probsolved = sc.nextInt();
        double percentage = sc.nextDouble();
        System.out.println("Name:" + name);
        System.out.println("Problems Solved" + probsolved);
        System.out.println("Percentage:" + percentage);
        sc.close();
    }
}
