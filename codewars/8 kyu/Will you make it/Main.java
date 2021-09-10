public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return fuelLeft * mpg >= distanceToPump;
    }

}