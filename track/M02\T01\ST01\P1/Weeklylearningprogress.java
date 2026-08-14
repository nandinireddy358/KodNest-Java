
class Weeklylearningprogress {

    public static void main(String[] args) {
        int ct = 17;
        int tt = 20;
        int dlh = 3;
        int ld = 5;
        int wlh = dlh * ld;
        double pp = (double) ct * 100 / tt;
        System.out.println("Completed Topics: " + ct);
        System.out.println("Topics left: " + tt);
        System.out.println("Weekly Learning Hours: " + wlh);
        System.out.println("Percentage: " + pp);
    }
}
