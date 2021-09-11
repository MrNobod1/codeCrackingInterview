import java.util.List;

public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        return listOfNumbers.stream().filter(i -> i % 2 != 0).collect(java.util.stream.Collectors.toList());
    }

}