public class Main {

    public static void main(final String... args) {
        java.util.Arrays.asList(
            countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}),
            countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})
        ).stream().map(java.util.Arrays::toString).forEach(System.out::println);
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        java.util.Map<Boolean, java.util.List<Integer>> r = java.util.Arrays.stream(input)
            .boxed()
            .collect(java.util.stream.Collectors.partitioningBy(x -> x > 0));
        return new int[]{r.get(true).size(), r.get(false).stream().mapToInt(Integer::intValue).sum()};
    }

}