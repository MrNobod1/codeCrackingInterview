import java.util.function.IntBinaryOperator;

public class Main {
    
    public static void main(final String... args) {
        java.util.stream.Stream.of(args).map((String s) -> s + " - " + getXO(s)).forEach(System.out::println);
    }

    public static boolean getXO(String s) {
        IntBinaryOperator reduceFunction = (accumulator, each) -> accumulator + (each == 'o' || each == 'O' ? 1 : (each == 'x' || each == 'X') ? -1 : 0);
        return s.chars().reduce(0, reduceFunction) == 0;
    }

}
