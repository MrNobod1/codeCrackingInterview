public class Main {

    public static void main(final String... args) {
        java.util.Arrays.asList(1, 2, 3, 4, 5, 6)
            .stream()
            .map(Main::reverse)
            .map(java.util.Arrays::toString)
            .forEach(System.out::println);
    }

    public static int[] reverse(final int n) {
        return java.util.stream.IntStream.rangeClosed(0, n-1)
            .map(i -> n - i)
            .toArray();
    }

}