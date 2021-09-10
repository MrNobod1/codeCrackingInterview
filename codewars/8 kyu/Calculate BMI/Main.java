public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static String bmi(double weight, double height) {
        double d = (double) weight / Math.pow(height, 2);
        return d <= 18.5 ? "Underweight" : d <= 25.0 ? "Normal" : d <= 30.0 ? "Overweight" : "Obese";
    }

}