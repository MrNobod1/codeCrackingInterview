public class Main {

    public static void main(final String... args) {
        
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // java.util.stream.Stream.of(arr1, arr2).flatMapToInt(Arrays:stream).sum();
        return java.util.Arrays.stream(arr1).sum() +
            java.util.Arrays.stream(arr2).sum();
    }

}