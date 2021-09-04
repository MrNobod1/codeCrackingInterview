import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(final String... args) {
        java.util.stream.Stream.of(args)
            .map((String s) -> new int[] { Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1])} )
            .map((int[] arr) -> arr[0] + " - " + arr[1] + " -> " + transformListOfListToString(generatePairsList(arr[0], arr[1])))
            .forEach(System.out::println);
    }

    public static List<int[]> generatePairs(final int m, final int n) {
        return IntStream.rangeClosed(m, n)
            .boxed()
            .map((Integer i) -> IntStream.rangeClosed(i, n).boxed().map((Integer j) -> new int[] { i, j }).collect(Collectors.toList()))
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
    }

    public static List<List<Integer>> generatePairsList(final int m, final int n) {
        return IntStream.rangeClosed(m, n)
            .boxed()
            .map((Integer i) -> IntStream.rangeClosed(i, n).boxed().map((Integer j) -> Arrays.asList(i, j)).collect(Collectors.toList()))
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
    }

    public static void testGeneratePairs() {
        Arrays.asList(new int[]{ 2, 2 }, new int[]{ 2, 3 }, new int[] { 2, 4 }, new int[] { 3, 3 }, new int[] { 3, 4 }, new int[] { 4, 4 });
    }

    private static String transformListOfArraysToString(List<int[]> listOfPairs) {
        return Arrays.toString(listOfPairs.stream().map(Arrays::toString).collect(Collectors.toList()).toArray());
    }

    private static String transformListOfListToString(List<List<Integer>> listOfPairs) {
        return listOfPairs.toString();
    }

    private static List<List<Integer>> getArrayFromList(List<int[]> listOfPairs) {
        //return listOfPairs.stream().map(Arrays::asList).collect(Collectors.toList());
        return null;
    } 

}
