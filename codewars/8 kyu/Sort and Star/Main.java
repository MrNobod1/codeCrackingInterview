import java.util.Arrays;

public class Main {

    public static void main(final String... args) {
        Arrays.asList(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"},
            new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"})
                .stream().map(Main::twoSort).forEach(System.out::println);
    }

    public static String twoSort(String[] s) {
        return java.util.Arrays.stream(s)
            .sorted()
            .findFirst()
            .get()
            .chars()
            .mapToObj(Character::toString)
            .collect(java.util.stream.Collectors.joining("***"));
    }

}