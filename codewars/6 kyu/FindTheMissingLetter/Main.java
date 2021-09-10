import java.util.Arrays;

public class Main {

    public static void main(final String... args) {
        Arrays.asList(new char[] { 'a', 'b', 'c', 'd', 'f' }, new char[] { 'O', 'Q', 'R', 'S' }).stream()
                .map(Main::findMissingLetter).forEach(System.out::println);
    }

    public static char findMissingLetter(char[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] > 1)
                return (char) (((int) array[i]) - 1);
        }
        return '0';
    }

}