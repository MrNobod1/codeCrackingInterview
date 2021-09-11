public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int closeCompare(double a, double b) {
        return a == b ? 0 : a < b ? -1 : 1;
    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin ? 0 : a < b ? -1 : 1;
    }

}