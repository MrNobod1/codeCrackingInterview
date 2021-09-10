public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static boolean check(Object[] a, final Object x) {
        return java.util.Arrays.stream(a).anyMatch(b -> java.util.Objects.equals(b, x));
    }

}