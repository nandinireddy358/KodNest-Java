
class Simpleintrest {

    public static void main(String[] args) {
        double principal = 1000.0;
        double rate = 6.5;
        double time = 2.0;
        double height = 72.0;
        double weight = 1.8;
        int marks = 410;
        double simpleintrest = (principal * rate * time);
        double totalamount = (principal + simpleintrest);
        double bmi = weight / (height * height);
        double percentage = (marks * 100.0 / 500);
        System.out.println("Simple Intrest: " + simpleintrest);
        System.out.println("Total Amount: " + totalamount);
        System.out.println("BMI: " + bmi);
        System.out.println("Percentage: " + percentage);
    }
}
