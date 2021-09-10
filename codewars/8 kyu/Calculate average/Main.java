public class Main {

    public static void main(final String... args) {
        System.out.println(find_average(new int[]{1, 2, 3, 3}));
    }

    public static double find_average(int[] array) {
        if (array == null || array.length == 0) return 0.0;
        return ((double) java.util.Arrays.stream(array).sum()) / array.length;
    }

}