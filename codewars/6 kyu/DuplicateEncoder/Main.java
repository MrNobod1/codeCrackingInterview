import java.util.stream.Collectors;
import java.util.function.Function;

public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
        System.out.println(encode("aabcdfe"));
    }

    public static String encode(String word) {
        word = word.toLowerCase();
        java.util.Map<Integer, Long> hash = word.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return word.chars().boxed().map((Integer i) -> hash.get(i) > 1 ? ")" : "(").collect(Collectors.joining(""));
    }

}