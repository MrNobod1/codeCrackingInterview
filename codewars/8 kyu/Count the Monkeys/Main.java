import static java.util.Arrays.*;

public class Main {

    public static void main(final String... args) {
        asList(3, 5, 6, 10, 1, 2).stream()
            .map(Main::monkeyCount)
            .map(java.util.Arrays::toString)
            .forEach(System.out::println);
    }

    public static int[] monkeyCount(final int n) {
        return java.util.stream.IntStream.rangeClosed(1, n).toArray();
    }

}