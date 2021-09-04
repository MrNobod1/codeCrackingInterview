import java.util.Arrays;
import java.util.function.Function;

public class Main {
    
    public static void main(final String... args) {
        System.out.println(addAll(java.util.stream.Stream.of(args).map(Integer::parseInt).mapToInt(Integer::intValue).toArray()));
    }

    public static int addAll(final int[] numbers) {
        int[] newNumbers = Arrays.stream(numbers).sorted().toArray();
        int cost = 0,
            preSum = newNumbers[0];
        for (int i = 1; i < newNumbers.length; i++) {
            preSum += newNumbers[i];
            cost += preSum;
        }
        return cost;
    }

}

/**
 * i = 1
 * 
 */