import java.util.stream.IntStream;

public class Main {
    
    public static void main(final String... args) {
        java.util.stream.Stream.of(args).map(Integer::parseInt).map((Integer i) -> i + " -> " + solution(i)).forEach(System.out::println);
    }

    public static int solution(int number) {
        if (number < 0) return 0;
        number--;
        int first = IntStream.rangeClosed(1, number / 3).boxed().mapToInt((Integer i) -> i * 3).sum(),
            second = IntStream.rangeClosed(1, number / 5).boxed().filter((Integer i) -> i % 3 != 0).mapToInt((Integer i) -> i * 5).sum();
        return first + second;
    }

}
