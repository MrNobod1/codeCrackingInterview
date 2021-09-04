import java.util.List;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Solution {
  
  public static List<int[]> generatePairs(final int m, final int n) {
    return IntStream.rangeClosed(m, n)
            .boxed()
            .map((Integer i) -> IntStream.rangeClosed(i, n).boxed().map((Integer j) -> new int[] { i, j }).collect(Collectors.toList()))
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
  }
  
}