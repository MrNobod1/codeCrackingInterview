public class Main {

    public static void main(final String... args) {
        System.out.println(liters(1600));
    }

    public static int liters(double time) {
        int t = (int) time;
        return t/2;
    }

}