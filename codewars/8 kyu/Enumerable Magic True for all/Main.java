import java.util.function.IntPredicate;

public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static boolean all(int[] list, IntPredicate predicate) {
        return java.util.Arrays.stream(list).allMatch(predicate);
    }

}