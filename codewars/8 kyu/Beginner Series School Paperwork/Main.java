public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int paperWork(int n, int m) {
        return n < 0 || m < 0 ? 0 : n * m;
    }

}