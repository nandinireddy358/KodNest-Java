
public class Weeklypreparation {

    public static void main(String[] args) {
        int JavaHoursPerDay = 2;
        int AptitudeHoursDay = 1;
        int numberOfDays = 5;
        int Java = JavaHoursPerDay * numberOfDays;
        int Aptitude = AptitudeHoursDay * numberOfDays;
        int Total = Java + Aptitude;
        System.out.println("Java: " + Java);
        System.out.println("Aptitude: " + Aptitude);
        System.out.println("Total: " + Total);
    }
}
