public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int grow(int[] x) {
        return java.util.Arrays.stream(x).reduce(1, Math::multiplyExact);
    }

}