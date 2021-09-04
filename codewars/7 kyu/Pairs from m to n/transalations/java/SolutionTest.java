import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
  
    private String transformListOfArraysToString(List<int[]> listOfPairs) {
        return Arrays.toString(listOfPairs.stream().map(Arrays::toString).collect(Collectors.toList()).toArray());
    }
  
    @Test
    void testSomething() {
        // assertEquals("expected", "actual");
      assertEquals(Solution.generatePairs(2, 4).toString(), "[[2, 2], [2, 3], [2, 4], [3, 3], [3, 4], [4, 4]]");
      assertEquals(Solution.generatePairs(2, 5).toString(), "[[2, 2], [2, 3], [2, 4], [2, 5], [3, 3], [3, 4], [3, 5], [4, 4], [4, 5], [5, 5]]");
      assertEquals(Solution.generatePairs(1, 4).toString(), "[[1, 1], [1, 2], [1, 3], [1, 4], [2, 2], [2, 3], [2, 4], [3, 3], [3, 4], [4, 4]]");
      assertEquals(Solution.generatePairs(3, 8).toString(), "[[3, 3], [3, 4], [3, 5], [3, 6], [3, 7], [3, 8], [4, 4], [4, 5], [4, 6], [4, 7], [4, 8], [5, 5], [5, 6], [5, 7], [5, 8], [6, 6], [6, 7], [6, 8], [7, 7], [7, 8], [8, 8]]");
      assertEquals(Solution.generatePairs(5, 9).toString(), "[[5, 5], [5, 6], [5, 7], [5, 8], [5, 9], [6, 6], [6, 7], [6, 8], [6, 9], [7, 7], [7, 8], [7, 9], [8, 8], [8, 9], [9, 9]]");
    }
}
