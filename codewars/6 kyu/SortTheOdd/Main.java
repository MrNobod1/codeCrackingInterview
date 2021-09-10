import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    // We could use an iterator instead of a List.
    public static int[] sortArray(int[] array) {
        List<Integer> oddList = Arrays.stream(array).boxed().filter(i -> i % 2 != 0).sorted()
                .collect(Collectors.toList());
        for (int i = 0, j = 0; i < array.length; i++)
            if (array[i] % 2 != 0)
                array[i] = oddList.get(j++);
        return array;
    }

}