public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int min(int[] list) {
        return java.util.Arrays.stream(list).min().getAsInt();
    }

    public static int max(int[] list) {
        return java.util.Arrays.stream(list).max().getAsInt();
    }

}