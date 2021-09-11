import java.util.Arrays;

public class Main {

    public static void main(final String... args) {
        Arrays.asList(4, 2, 5, 88, 100, 67, 90, 10, 99, 32)
            .stream()
            .map(Main::divide)
            .forEach(System.out::println);
    }

    public static boolean divide(int weight) {
        return weight % 2 == 0 && weight != 2;
    }

}