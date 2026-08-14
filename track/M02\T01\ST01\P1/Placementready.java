
class Placementready {

    public static void main(String[] args) {
        int marks = 60;
        int attendance = 80;
        int practiceDays = 3;

        boolean placementready = marks >= 60 && attendance >= 75;
        String res = placementready ? "Placement Ready" : "Continue Practice";
        System.out.println(res);
        for (int i = 1; i <= practiceDays; i++) {
            System.out.println("Practice Day: " + i);
        }
    }
}
